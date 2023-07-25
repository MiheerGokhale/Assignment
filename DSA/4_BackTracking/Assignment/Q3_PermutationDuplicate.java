import java.util.ArrayList;

public class Q3_PermutationDuplicate {
    public static ArrayList<String> permutationsDuplicate(int arr[]){
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

        int position=-1;

        for (int i = 0; i < ans.length(); i++) {
            int ch=ans.charAt(i)-'0';
            if (arr[index]==ch) {
                position=i;
            }
        }

        for (int i = 0; i <ans.length()+1; i++) {
            String start=ans.substring(0, i);
            String end=ans.substring(i,ans.length());

            if (position==i) {
                //avoid putting same number at the right of that number
                continue;
            }
        
            //recursive function call
            list.addAll(helper(arr, start+elemIdx+end, index+1));
        }

        return list;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2};
        System.out.println(permutationsDuplicate(arr));
        
    }
}
