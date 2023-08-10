import java.util.Arrays;

public class Q2_Segregate_Positive_And_Negative{
    public static void partitionAlgorithm(int arr[],int l,int h){
        int i=l;
        int pivot=0;

        for (int j = i+1; j < arr.length; j++) {
            if (arr[j]<pivot) {
                i++;

                //swap arr[i] and arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

            //swap arr[l] and arr[i]
            int temp=arr[i];
            arr[i]=arr[l];
            arr[l]=temp;

    }
    public static void main(String[] args) {
        int arr[]={19, -20, 7, -4, -13, 11, -5, 3};
        partitionAlgorithm(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}