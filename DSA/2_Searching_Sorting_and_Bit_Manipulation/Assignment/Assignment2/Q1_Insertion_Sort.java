//Time Complexity: O(n^2)
//Space Complexity: O(1)

import java.util.Arrays;

public class Q1_Insertion_Sort {
    //Implementation of decreasing insertion sort
    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while( j>0 && arr[j-1]<arr[j]){
                //swapped arr[j] and arr[j-1]
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};

        //function calling
        insertionSort(arr);
        System.out.println("Sorted array in decreasing order:");
        System.out.println(Arrays.toString(arr));
    }
}
