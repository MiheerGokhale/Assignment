public class Q1_Kth_Largest_Element {

    // Time Complexity:
    // worst case: O(n^2) every time one subarray consist 1 element and other
    // consist of n-1 element
    // Best case: O(n) every time left and right subarray will be of equal length
    // Space Complexity: O(1)
    public static int quickSort(int arr[], int l, int r, int k) {
        // 1. Dividing the problem into subproblems
        int m = partition(arr, l, r);

        if (m == (k - 1)) {// m is index and k is position
            return arr[m];
        }
        // traverse towards left side of an array}
        else if (m > (k - 1)) {
            return quickSort(arr, l, m - 1, k);
        }
        // traverse towards right side of an array
        // 2. Conquer the subproblems via recursion
        else {

            return quickSort(arr, m + 1, r, k);
        }

    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // function to do the partition of an array
    public static int partition(int arr[], int l, int r) {
        // i - smaller and j - bigger element
        int i = l;
        // first element as the pivot element in an array
        int pivot = arr[l];

        for (int j = i + 1; j <= r; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // swap pivot and arr[i]
        // to get the correct position of the pivot element
        int temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;

        // index of the pivot element
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 6, 8, 1, 62 };
        int n = arr.length;
        int k = 2;

        System.out.println(quickSort(arr, 0, n - 1, n - k + 1));
    }
}