//Time Complexity: O(n*n)
//Space Complexity: O(1)

import java.util.Scanner;

public class BothDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Dimensions of square matrix :");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i==j) || (i+j)==n-1) {
                    System.out.print(arr[i][j]);
                    System.out.print("  ");
                }
            }
        }
        sc.close();

    }
}
