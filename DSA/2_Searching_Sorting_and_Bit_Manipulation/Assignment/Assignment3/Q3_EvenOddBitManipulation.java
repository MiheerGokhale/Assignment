//Time Complexity: O(1)
//Space Complexity: O(1)

import java.util.Scanner;

public class Q3_EvenOddBitManipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int num=sc.nextInt();

        // & operator compare bits of both number from right side
        if ((num&1)==1) {
            System.out.println("Odd");
            // num & 1 will return 1 because the binary representations of num and 1 are *.....1 and 001, respectively. The first bit of both numbers is 1, so the result is 1.
        }
        else{
            System.out.println("Even");
        }
        sc.close();
    }
}
