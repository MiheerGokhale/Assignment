import java.util.HashMap;

public class Q3_DuplicateElement {

    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static void detectDuplicate(int arr[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        boolean duplicate=false;

        for (int i = 0; i < arr.length; i++) {
            //if hashmap have same key with different i value then it would mean it have duplicate value
            if (hm.containsKey(arr[i])) {
                duplicate=true;
                break;
            }
            hm.put(arr[i], 1);
        }

        if (duplicate) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        detectDuplicate(arr);
    }
}
