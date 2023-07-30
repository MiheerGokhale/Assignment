import java.util.Arrays;
import java.util.Stack;

public class Q4_Asteroids {
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static int[] collision(int arr[]) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            //for first element
            if (i == 0) {
                stack.push(arr[i]);
                continue;
            }

            //Both are positive
            if (stack.peek() >= 0 && arr[i] >= 0) {
                stack.push(arr[i]);
            }
            //both are negative
            else if (stack.peek() < 0 && arr[i] < 0) {
                stack.push(arr[i]);
            } 
            //stack peek are positive and arr[i] is negative
            else if (stack.peek() >= 0 && arr[i] < 0) {
                if (stack.peek() == Math.abs(arr[i])) {
                    // Both asteroid destroyed
                    stack.pop();
                    continue;
                }
                
                if (stack.peek() > Math.abs(arr[i])) {
                    // arr[i] asteroid destroyed
                    continue;
                }
                while(stack.peek()<Math.abs(arr[i])){
                    // stack.peek() asteroid destroyed
                    stack.pop();
                }
            } 
            //stack peek are negative and arr[i] is positive
            else {// stack.peek()<0 && arr[i]>=0
                if (Math.abs(stack.peek())== arr[i]) {
                    // Both asteroid destroyed
                    stack.pop();
                    continue;
                }

                if (Math.abs(stack.peek()) > arr[i]) {
                    // arr[i] asteroid destroyed
                    continue;
                } 
                while(Math.abs(stack.peek())<arr[i]) {
                    // stack.peek() asteroid destroyed
                    stack.pop();
                }

            }
        }

        int answer[]=new int[stack.size()];
        int i=0;
        while(!stack.isEmpty()){
            answer[i]=stack.pop();
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr[]={10,2,-5};
        System.out.println(Arrays.toString(collision(arr)));


    }
}
