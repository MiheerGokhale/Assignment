//Time Complexity: O(n)
//Space Complexity: O(1)

import java.util.Scanner;

public class Q5_OddDuplicateElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[]={4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};

        int n=arr[0];
        for (int i=1;i<arr.length;i++) {
            n^=arr[i];
        }
        System.out.println(n);
        sc.close();
/*
* Some key observations about 1or operator/
. XOR of ‘1’ with )/
. 1 ^ ) = 0
. XOR of ‘1’ with itself even number of times/
. 1 ^ 1 = (
. XOR of ‘1’ with itself odd number of times/
. (1 ^ 1 ^ 1) = (1 ^ (1 ^ 1)) = (1 ^ )) = 0
. (1 ^ 1 ^ 1 ^ 1 ^ 1) = (1 ^ (1 ^ 1) ^ (1 ^ 1)) = (1 ^ ) ^ )) = 0
. This shows taking 1or of the same number an odd number of times results in the number itself whereas taking
1or even number of times will result in )[
. So, if we take XOR of all array elements, even appearing elements will cancel each other, and we are left with
the only odd appearing element[
. We will simply return that element.
 */
    }
}
