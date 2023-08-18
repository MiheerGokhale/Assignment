public class Q2_ActivitySelection {
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public static void activitySelection(int[] start,int[] finish){
        //assuming we got finished array according to increasing order of finished work

        int i=0;
        System.out.print(i+" ");//i=0 always exist

        for (int j = 1; j < start.length; j++) {
            //starting time of next work should be greater than finish time of previous work
            if (start[j]>=finish[i]){
                System.out.print(j+" ");
                i=j;
            }
        }
    }
    public static void main(String[] args) {
        int[] start ={1,3,0,5,8,5};
        int[] finish ={2,4,6,7,9,9};

        System.out.println("Maximum activity that can be done here is: ");
        activitySelection(start,finish);
    }
}
