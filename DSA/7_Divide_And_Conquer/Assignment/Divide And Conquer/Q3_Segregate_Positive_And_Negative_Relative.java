import java.util.Arrays;

public class Q3_Segregate_Positive_And_Negative_Relative {

    public static void seprateNegativePositiveOptimised(int arr[],int temp[],int low,int high){
        if (low<high) {
            //divide
            int mid=low+(high-low)/2;
            //conquer
            //left side
            seprateNegativePositiveOptimised(arr, temp, low, mid);
            //right side
            seprateNegativePositiveOptimised(arr,temp, mid+1, high);
            //merge
            mergeOptimised(arr,temp,low,mid,high);
        }
    }

    public static void mergeOptimised(int arr[],int temp[],int low,int mid,int high){
        int i,j,k=low;

        //first negative element of left side
        for(i=low;i<=mid;i++){
            if (arr[i]<0) {
                temp[k]=arr[i];
                k++;
            }
        }
        
        //then negative element of left side
        for(j=mid+1;j<=high;j++){
            if (arr[j]<0) {
                temp[k]=arr[j];
                k++;
            }
        }
        
        //first positive element of left side
        for(i=low;i<=mid;i++){
            if (arr[i]>=0) {
                temp[k]=arr[i];
                k++;
            }
        }
        
        //then positive element of left side
        for(j=mid+1;j<=high;j++){
            if (arr[j]>=0) {
                temp[k]=arr[j];
                k++;
            }
        }

        //copy temp to arr form low to high
        for(i=low;i<=high;i++){
            arr[i]=temp[i];
        }
    }

    
    public static void seprateNegativePositive(int arr[],int low,int high){
        if (low<high) {
            //divide
            int mid=low+(high-low)/2;
            //conquer
            //left side
            seprateNegativePositive(arr, low, mid);
            //right side
            seprateNegativePositive(arr, mid+1, high);
            //merge
            merge(arr,low,mid,high);
        }
    }

    public static void merge(int arr[],int low,int mid,int high){
        int i,j,k=low;

        int n1=mid-low+1;// include mid
        int n2=high-mid;// exclude mid

        int left[]=new int[n1];
        int right[]=new int[n2];

        //left side copied
        for(i=0;i<n1;i++){
            left[i]=arr[low+i];
        }

        //right side copied
        for(j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }

        //first negative element of left side
        for(i=0;i<n1;i++){
            if (left[i]<0) {
                arr[k]=left[i];
                k++;
            }
        }
        
        //then negative element of left side
        for(j=0;j<n2;j++){
            if (right[j]<0) {
                arr[k]=right[j];
                k++;
            }
        }
        
        //first positive element of left side
        for(i=0;i<n1;i++){
            if (left[i]>=0) {
                arr[k]=left[i];
                k++;
            }
        }
        
        //then positive element of left side
        for(j=0;j<n2;j++){
            if (right[j]>=0) {
                arr[k]=right[j];
                k++;
            }
        }
    }
    public static void main(String[] args) {
            int arr[]={19,-20,7,-4,-13,11,-5,3};
            // seprateNegativePositive(arr, 0, arr.length-1);

            seprateNegativePositiveOptimised(arr, new int[arr.length], 0, arr.length-1);

            System.out.println(Arrays.toString(arr));
        
    }
}
