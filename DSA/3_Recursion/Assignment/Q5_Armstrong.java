//Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.Scanner;

public class Q5_Armstrong {
    //function definition
    public static int armstrong(int n,int count){
        int sum=0,m=0;
        //base case condition
        if (n==0) {
            return 0;
        }
        else{
            m=n%10;
            sum=m;
            for (int i = 0; i < count-1; i++) {
                sum*=m;
            }
            //recursive call
            return sum+armstrong(n/10, count);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int n=num;
        
        int count=0;
        while (num!=0) {
            count++;
            num/=10;
        }
        int result=armstrong(n,count);
        if (result==n) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
