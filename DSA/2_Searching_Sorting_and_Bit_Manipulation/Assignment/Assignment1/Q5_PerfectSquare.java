//Time Complexity: O(logN)
//Space Complexity: O(1)

import java.util.Scanner;

public class Q5_PerfectSquare {
    public static int bubbleSort(int num){
        int low=0,result=0;
        // int high=num-1; //or
        int high=num/2;// as num square root always <= num/2
        int mid=0;

        while(low<=high){
            mid=low+(high-low)/2;
            int square=mid*mid;

            if (square==num) {
                return mid;
            }
            else if (square<num) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        result=mid-1;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        //function call
        int result=bubbleSort(num);
    
        if (result*result==num) {
            System.out.println(num+" is a perfect square");
        }
        else{
            System.out.println(num+" is not a perfect square");
        }
        sc.close();
    }
}
