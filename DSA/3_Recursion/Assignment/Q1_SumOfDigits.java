//Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.Scanner;

public class Q1_SumOfDigits{
    //function definition
    public static int sumOfDigits(int n){
        // int sum=0;
        //base case condition
        if (n==0) {
            return n;
        }
        else{
            // sum+=n%10+sumOfDigits(n/10);
            // return sum;
            //calling function recursively 
            return n%10+sumOfDigits(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int result=sumOfDigits(num);
        System.out.println("Sum is: "+result);
        sc.close();
    }
}