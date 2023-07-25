public class Q1_EqualSubsetWithSameSum{
    public static boolean equalSum(int arr[],int k){
        return helper(arr, k,0, 0);

    }

    public static boolean helper(int arr[],int k,int sum,int j){
        //base case condition
        if (k==0) {
            int num=0;
            for (int i = 0; i < k; i++) {
                num+=arr[i];
            }

            if (sum==num) {
                return true;
            }
            else{
                return false;
            }
        }

        for (int i = j; i < arr.length; i++) {
            //when i is taken into sum
            if(helper(arr, k-1, sum+i,j+1)){
                return true;
            }

            //when i is not takem into sum
            if(helper(arr, k, sum,j+1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1};
        int k=2;

        System.out.println(equalSum(arr, k));
    }
}