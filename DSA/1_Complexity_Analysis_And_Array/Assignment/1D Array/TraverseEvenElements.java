//Time Complexity: O(n)
//Space Complexity: O(1)

public class TraverseEvenElements {
    public static void main(String[] args) {
        // int arr[] = {34,21,54,65,43};
        int arr[] = {4,3,6,7,1};
        for (int i : arr) {
            // System.out.println(i%2==0?i:"");
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
