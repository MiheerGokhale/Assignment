import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q4_SubsetSum {
    public static boolean subsetSum(int arr[],int target,int n,ArrayList<Integer> ans,int index){
        //base case condition
        if (n==0) {
            return helper(ans,target);
        }

        //taking arr[i] in subset
        ans.add(arr[index]);
        if (subsetSum(arr, target, n-1,ans,index+1)) {
            return true;
        }
        
        //not taking arr[i] in subset
        ans.remove(ans.size()-1);
        if (subsetSum(arr, target, n-1, ans, index+1)) {
            return true;
        }

        return false;
    }

    public static boolean helper(ArrayList<Integer> ans,int target){
        int mul=1;
        for (Integer integer : ans) {
            System.out.println(ans);
            mul*=integer;
        }

        if (mul==target) {
            return true;
        }
        
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        if (subsetSum(arr, 16, arr.length, new ArrayList<Integer>(), 0)) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
