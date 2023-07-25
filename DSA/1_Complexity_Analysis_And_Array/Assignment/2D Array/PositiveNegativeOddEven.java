//Time Complexity: O(m*n)
//Space Complexity: O(1)

import java.util.Arrays;
import java.util.Scanner;

public class PositiveNegativeOddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];// initializing the array with default value as 0
        int positive = 0, negative = 0, odd = 0, even = 0,zeros=0;
        System.out.println("Enter the elements of array:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > 0) {
                    positive++;
                    if (arr[i][j] % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }
                } else if (arr[i][j] < 0) {
                    negative++;
                    if (arr[i][j] % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }
                } else {
                    zeros++;
                    even++;
                }

            }
        }

        System.out.print("Numbers of positive numbers = " + positive);
        System.out.println();
        System.out.print("Numbers of negative numbers = " + negative);
        System.out.println();
        System.out.print("Numbers of odd numbers = " + odd);
        System.out.println();
        System.out.print("Numbers of even numbers = " + even);
        System.out.println();
        System.out.print("Numbers of zeros numbers = " + zeros);
        sc.close();
    }
}
