//Time Complexity: O(n)
//Space Complexity: O(1)

import java.util.Scanner;

public class Q4_CountSetBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int n=num;
        int count=0;

        while(num!=0){
            count+=num&1; // & operator take right bit of num and 1 and perform bit wise and operation
            num>>=1; // >> right shift operator perform bitwise right shift by 1 and assign it to num
        }
        System.out.print("Total number of set bit in "+n+" is: "+count);
        sc.close();
    }
}
