import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Q5_Temperature {
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static int[] temperature(int arr[]){
        Stack<Integer> stack=new Stack<>();

        int answer[]=new int[arr.length];
        int prev=0,m=0,count=0,flag=0,j=0;
        for (int i = 0; i < arr.length; i++) {  

            //initialising prev
            if (flag==0) {
                prev=arr[i];
                flag=1;
                j=i;
            }


            if (prev>=arr[i]) {
                m+=1;
                stack.push(m);
                if(i>arr.length-1){
                    flag=0;
                    i=j;
                    answer[count]=0;
                    count++;
                }
            }
            else{
                if (stack.size()>0) {
                    i-=stack.peek();
                }
                answer[count]=stack.pop();
                count++;
                flag=0;
                m=0;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int temp[]={55,38,53,81,61,93,97,32,43,78};
        System.out.println(Arrays.toString(temperature(temp)));
    }
}
