public class Q4_Permutations_Exist {

    //Time Complexity: O(nlog(n)) Best and O(n^2) Worst
    //Space complexity: O(1)
    public static void permutationExist(int arr1[],int arr2[],int k){
        int n=arr1.length;
        int flag=0;
        quickSort(arr1, 0, n-1);
        quickSort(arr2, 0, n-1);

        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i]+arr2[n-i-1])>=k) {
                continue;
            }
            else{
                flag=1;
                break;
            }
        }

        if (flag==0) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    //Time Complexity:
    //worst case: O(n^2) when sorted array
    //Best case: O(nlog(n)) when every pivot get in the middle of the array
    // function of the quicksort algorithm
    public static void quickSort(int arr[], int l, int h) {
        if (l < h) {
            // 1. Divide the array into two subproblems
            int m = partition(arr, l, h);
            // 2. Conquer the subproblems via the recursion
            quickSort(arr, l, m - 1);
            quickSort(arr, m + 1, h);
        }
    }

    //Time Complexity: O(n)
    //Space Complexity: O(1)
    // function to do the partition of an array
    public static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l;

        for (int j = i + 1; j <= h; j++) {
            if (arr[j] <= pivot) {
                i = i + 1;
                // swap(arr[i], arr[j])
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // swap (arr[l], arr[i])
        // to get the correct position of the pivot element
        // swap arr[i] and arr[l]=pivot as left to the i consist all element smaller to
        // pivot and right of the i consist all element bigger to pivot
        int temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;

        // return ith smallest element in the array or correct position of pivot in
        // array to make subarray for left and right side of pivot
        return i;
    }
    public static void main(String[] args) {
        int arr1[]={2,1,3};
        int arr2[]={7,8,9};
        int k=10;

        permutationExist(arr1, arr2, k);
    }
}
