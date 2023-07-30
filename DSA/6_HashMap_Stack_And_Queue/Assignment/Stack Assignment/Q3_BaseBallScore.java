import java.util.Stack;

public class Q3_BaseBallScore {
    //Time Complexity: O(n)
    //space Complexity: O(n)
    public static int sumScore(String arr[]){
        Stack<Integer> score=new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "D":
                    score.push(2*score.peek());//2 times of top element
                    break;

                case "C":
                    score.pop();//invalid top element
                    break;
                
                case "+":
                 score.push(score.peek()+score.elementAt(score.size()-2));//sum of previous 2 element
                    break;

                default:
                    score.push(Integer.parseInt(arr[i]));//normal int
                    break;
            }
        }

        int sum=0;
        while (!score.isEmpty()) {
            System.out.println(score.peek());
            sum+=score.pop();
            
        }

        return sum;
    }
    public static void main(String[] args) {
        String arr[]= {"5","-2","4","C","D","9","+","+"};
        System.out.println(sumScore(arr));
    }
}
