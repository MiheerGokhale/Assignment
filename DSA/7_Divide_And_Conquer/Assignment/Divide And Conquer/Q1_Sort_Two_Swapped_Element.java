import java.util.Arrays;

public class Q1_Sort_Two_Swapped_Element {
    public static void sortSwappedArray(int[] arr) {
        int n = arr.length;
        int first = -1, second = -1;

        // Find the two swapped elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (first == -1) {// for Ex 8>4
                    first = i;
                }
                second = i + 1;// for Ex 7>3
            }
        }

        // Swap the two elements
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 6, 7, 5, 9, 10 };
        sortSwappedArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}