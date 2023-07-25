//Time Complexity: O(n^2)
//Space Complexity: O(1)

import java.util.Arrays;

public class Q1_Bubble_Sort{
    //Implementation of decreasing bubblesort 
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]<arr[j+1]) {
                    //swapped arr[j] and arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                //if array became sorted before n^2 iteration
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};

        //function calling
        bubbleSort(arr);
        System.out.println("Sorted array in desending order:");
        System.out.println(Arrays.toString(arr));
    }
}