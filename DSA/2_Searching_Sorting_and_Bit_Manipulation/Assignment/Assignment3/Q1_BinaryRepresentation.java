//Time Complexity: O(n)
//Space Complexity: O(1)

import java.util.Scanner;

public class Q1_BinaryRepresentation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Decimal Number:");
        int num=sc.nextInt();
        int n=num;
        
        String s="";

        while (num!=0) {
            int temp=num%2;// num%2 give remainder
            s=temp+s;
            num=num/2;// num/2= always in int data type// num/2 give quotient       
        }
        System.out.println("Binary representation of "+n+" is: "+s);
        sc.close();
    }
}