//Time Complexity: O(n)
//Space Complexity: O(n)

public class Q3_MaxArray {
    //function definition
    public static int maxArrayValue(int arr[],int n){
        //base case condition
        if (n==0) {
            return arr[0];
        }
        else{
            // recursive call
            if(arr[n-1]>maxArrayValue(arr, n-1)){
                return arr[n-1];
            }
            else{
                // recursive call
                return maxArrayValue(arr, n-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={13, 1, -3, 22, 5};

        int result=maxArrayValue(arr,arr.length);
        System.out.println("Max value is: "+result);
    }
}

//second approach
/*
// Recursive java program to find maximum element in an array
// function to print maximum element using recursion
import java.io.*;
import java.util.*;
public class Main{
    public static int maxValue(int arr[], int n, int idx){
        if(idx == n - 1)
        return arr[n - 1];
        int maxOfLaterIndices = maxValue(arr, n,idx + 1);
        int maxVal = Math.max(arr[idx], maxOfLaterIndices);
        return maxVal;
    }
    public static void main(String[] args) {
        int[] arr={13,1,-3,22,5};
        int n=arr.length;
        System.out.println("The max value is : " + maxValue(arr,n,0));
    }
}
 */
