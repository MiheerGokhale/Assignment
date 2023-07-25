//Time Complexity: O(logN)
//Space Complexity: O(1)

import java.util.Scanner;

public class Q4_TotalOccurence{
    public static int bubbleSortFirst(int arr[],int target){
        int low=0,high=arr.length-1;
        int answer = -1;
        while(low <= high){
           int mid = low + (high  - low)/2;
           //normal approach
        //     if(arr[mid] == target){
        //        answer = mid;
        //        high=mid-1;  //if you found the target or if target is lesser than the current element, to find firse occurrence move to left half of the array
        //    }
           //Optismised approach
           if(arr[mid] == target){
               answer = mid;
               if ((mid-1)>=0 && arr[mid-1]==arr[mid]) {
                   high=mid-1;  //if you found the target or if target is lesser than the current element, to find first occurrence move to left half of the array 
               }
               else{
                break;
               }
           }
           else if(arr[mid]<target){
               low=mid+1; 
           }
           else {
            high=mid-1;
           }
       }
       return answer;
    }

    public static int bubbleSortLast(int arr[],int target){
        int low=0,high=arr.length-1;
        int answer = -1;
        while(low <= high){
           int mid = low + (high  - low)/2;
        //    //normal approach
        //     if(arr[mid] == target){
        //        answer = mid;
        //        low = mid + 1;  //if you found the target or if target is greater than the current element, to find last occurrence move to right half of the array
        //    }
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

        System.out.print("Enter the target element: ");
        int target=sc.nextInt();

        //function call
        int first_Occurence=bubbleSortFirst(arr,target);
        int last_Occurence=bubbleSortLast(arr,target);
        int total_Occurence=last_Occurence-first_Occurence+1;

        if(first_Occurence==last_Occurence && first_Occurence==-1){
            System.out.println("Element not found in the array");
        }
        else{
            // System.out.println("first occurence "+first_Occurence);
            // System.out.println("last occurence "+last_Occurence);
            System.out.println("Total occurence is: "+total_Occurence);
        }
        sc.close();
    }
}