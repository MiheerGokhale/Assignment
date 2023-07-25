//Time Complexity: O(n^2)
//Space Complexity: O(1)

import java.util.Arrays;

public class Q2_Selection_Sort {
    // Implementation of decreasing selectionSort
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int max_ind=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[max_ind]<arr[j]) {
                    max_ind=j;
                }
            }
            if (max_ind!=i) {
                //swapped arr[max_ind] and arr[i]
                int temp=arr[i];
                arr[i]=arr[max_ind];
                arr[max_ind]=temp;

            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};

        //function call
        selectionSort(arr);
        System.out.println("Sorted array in decreasing order:");
        System.out.println(Arrays.toString(arr));
    }
}
