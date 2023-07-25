//Time Complexity: O(logN)
//Space Complexity; O(1)

import java.util.Scanner;

public class Q3_NoOfOne {
    public static int bubbleSort(int arr[]){
        int low=0,high=arr.length-1,idx=0,total_ones=0;

        while(low<=high){
            int mid=low +(high-low)/2;

            if (arr[mid]==1) {
                idx=mid;
                if (arr[mid-1]==0) {
                    break;
                }
                else{
                    high=mid-1;
                }
            }
            else if(arr[mid]<1){
                low=mid+1;
            }
            // else{
            //     high=mid-1;
            // }
        }
        total_ones=arr.length-idx;
        return total_ones;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of element in the array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        //function call
        int result=bubbleSort(arr);
        System.out.println(result);

        sc.close();
        
    }
}
