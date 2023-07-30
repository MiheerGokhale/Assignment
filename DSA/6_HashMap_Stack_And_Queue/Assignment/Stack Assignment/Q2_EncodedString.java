import java.util.Stack;

public class Q2_EncodedString{

    public static String encodedString(String input){
        Stack<String> stack=new Stack<>();
        int num=0;
        String s="";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)==']') {
                while (stack.peek()!="[") {
                    s=stack.pop()+s;
                }
                stack.pop();
                int count=0;
                num=Integer.parseInt(stack.pop());

                for (int j = 0; j < num; j++) {
                    s+=s;
                }
                stack.push(s);
                s="";
            }
        }

        return stack.pop();
    }
    public static void main(String[] args) {
        System.out.println(encodedString( "3[a]2[bc]"));
    }
}