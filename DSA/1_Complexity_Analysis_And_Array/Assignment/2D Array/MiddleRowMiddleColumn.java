//Time Complexity: O(n*n)
//Space Complexity: O(1)

import java.util.Scanner;

public class MiddleRowMiddleColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Dimensions of square matrix :");
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        String row="",column="";

        System.out.println("Enter the elements of matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();

                if(i==(n/2)){
                    row+=arr[i][j]+" ";
                }
                else if(j==(n/2)){
                    column+=arr[i][j]+" ";
                }
            }
        }
        // System.out.println(row);
        // System.out.println(column);
        System.out.println(column+row);
    }
}
