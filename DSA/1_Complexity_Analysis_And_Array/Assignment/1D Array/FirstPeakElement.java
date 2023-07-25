//Time Complexity: O(n)
//Space Complexity: O(1)

public class FirstPeakElement {
    public static void main(String[] args) {
        // A peak element is an element that is greater than its just left and just
        // right neighbor.
        // int arr[] = { 1, 3, 2, 6, 5 };
        int arr[] = {1,4,7,3,2,6,5};
        // int peak;
        int n=arr.length;

        // for (int i = 1; i < arr.length; i++) {
        //     peak = arr[i];
        //     if (peak > arr[i - 1] && peak > arr[i + 1]) {
        //         System.out.println(peak);
        //         break;
        //     }
        // }

        // Optimised approach
        
        for (int i = 0; i < n/2; i++) {
            if (i==0) {
                if (arr[i]>arr[i+1]) {
                    System.out.println(arr[i]);
                    break;
                }
                if (arr[n-1]>arr[n-2]) {
                    System.out.println(arr[n-1]);
                    break;
                }
            }
            else{
                if (arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                    System.out.println(arr[i]);
                    break;
                }
                else if(arr[n-2]>arr[n-3] && arr[n-2]>arr[n-1]){
                    System.out.println(arr[n-2]);
                    break;
                }
            }
        }
    }
}
