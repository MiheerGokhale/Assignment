import java.util.ArrayList;

public class Q2_Permutations {
    public static ArrayList<String> permutations(int arr[]){
        return helper(arr,"",0);
    }

    public static ArrayList<String> helper(int arr[],String ans,int index){
        //base case condition
        if (index==arr.length) {
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list; 
        }

        ArrayList<String> list=new ArrayList<>();
        int elemIdx=arr[index];

        for (int i = 0; i <ans.length()+1; i++) {
            String start=ans.substring(0, i);
            String end=ans.substring(i,ans.length());

            //recursive function call
            list.addAll(helper(arr, start+elemIdx+end, index+1));
        }

        return list;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(permutations(arr));
    }
}
