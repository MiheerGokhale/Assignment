//Time Complexity: O(m*n)
//Space Complexity: O(1)

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];// initializing the array with default value as 0
        System.out.println("Enter the elements of array:");
        int larger=arr[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();

                if (arr[i][j]>larger) {
                    larger=arr[i][j];
                }
            }
        }
        System.out.println(larger);
        sc.close();
    }
}
