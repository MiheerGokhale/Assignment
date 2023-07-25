//Time Complexity: O(n)//linear search
//Time Complexity: O(logN)//binary search
//Space Complexity: (1)

import java.util.Scanner;

public class Q2_LastOccurenceOfTarget{
    public static int lastOccurrence(int[] arr,int target){
        int low=0,high=arr.length-1;
      int answer = -1;
       while(low <= high){
           int mid = low + (high  - low)/2;
           //normal approach
            if(arr[mid] == target){
               answer = mid;
               low = mid + 1;  //if you found the target or if target is greater than the current element, to find last occurrence move to right half of the array
           }
           //Optismised approach
           if(arr[mid] == target){
               answer = mid;
               if ((mid+1)<arr.length && arr[mid+1]==arr[mid]) {
                   low = mid + 1;  //if you found the target or if target is greater than the current element, to find last occurrence move to right half of the array 
               }
               else{
                break;
               }
           }
           else if(arr[mid] > target){
               high  = mid - 1; 
           }
           else low = mid + 1;
       }
       return answer;
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

        System.out.println("Enter the target element");
        int target=sc.nextInt();

        // int idx=-1;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]==target){
        //         idx=i;
        //     }
        // }

        //Optimised approach for sorted array
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]==target){
        //         idx=i;
        //         if ((i+1)<arr.length && arr[i+1]==target) {
        //             continue;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // if (idx!=-1) {
        //     System.out.print("the index of the element is "+ idx);
        // }
        // else{
        //         System.out.println("element not found in a array");
        // }
        System.out.println("The last occurrence of target is at index : " + lastOccurrence(arr , target));

        sc.close();
    }
}
