//Time complexity: O(n)
//Space Complexity: O(1)

import java.util.Scanner;

public class Q2_PoweOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int remiander=num;

        while(num!=0){
            remiander%=2;//give remainder
            num/=2;//give quotient
        }
        if (remiander==0) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        sc.close();
    }
}
