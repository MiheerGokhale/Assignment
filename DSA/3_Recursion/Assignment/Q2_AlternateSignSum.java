//Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.Scanner;

public class Q2_AlternateSignSum {
    //function definition
    public static int alternateSignSum(int n){
        if (n==0 || n==1) {
            return n;
        }
        else{
            //recursive statement
            if (n%2==0) {
                return -n+alternateSignSum(n-1);
            }
            else{
                return n+alternateSignSum(n-1);
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        int result=alternateSignSum(num);
        System.out.println("Sum is: "+result);
        sc.close();
    }
}
