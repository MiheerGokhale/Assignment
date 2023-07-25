//Time Complexity: O(n)
//Space Complexity: O(n)

public class Q4_SumArray {
    //function definition
    public static int sumArray(int arr[],int n){
        //base case condition
        if(n==1){
            return arr[0];
        }
        else{
            //recursive call
            return arr[n-1]+sumArray(arr, n-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={92, 23, 15, -20, 10};

        int result=sumArray(arr,arr.length);
        System.out.println("Sum is: "+result);
    }
}
