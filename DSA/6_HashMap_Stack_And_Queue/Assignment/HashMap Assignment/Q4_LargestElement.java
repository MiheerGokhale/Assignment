import java.util.TreeMap;

public class Q4_LargestElement {
    //Time Complexity: O(nlogn)
    //Space Complexity: O(n)
    //Insertion takes: O(logn)
    public static void largestElement(int arr[]){
        TreeMap<Integer,Integer> tm=new TreeMap<>();//sorted order based on key

        for (int i = 0; i < arr.length; i++) {
            tm.put(arr[i], i);
        }

        System.out.println(tm.lastKey());
    }
    public static void main(String[] args) {
        int arr[]={4,2,7,1,9};
        largestElement(arr);
    }
}
