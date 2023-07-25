//Time Complexity: O(n)
//Space Complexity: O(1)

public class MaxElement {
    public static void main(String[] args) {
    // int arr[] = {34,21,54,65,43};
    int arr[] = {4,3,6,7,1};
    // int temp=0;
    int temp=arr[0];

    // for(int i=0;i<arr.length-1;i++){
    //     temp=arr[i];
    //     if(arr[i+1]>arr[i]){
    //         temp=arr[i+1];
    //     }
    // }

    for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            temp=arr[i];
        }
    }
    System.out.println(temp);
    }
}
