//Time Complexity: O(n)
//Space Complexity: O(1)

public class SecondLargestElement {
    public static void main(String[] args) {
    // int arr[] = {34,21,54,65,43};
    int arr[] = {4,3,6,7,1};
    int firstLargest=arr[0],secondLargest=0;

    for(int i=1;i<arr.length-1;i++){
        if(firstLargest<arr[i+1]){
            secondLargest=firstLargest;
            firstLargest=arr[i+1];
        }
    }
    System.out.print("Second largest element is: "+secondLargest);
    }
}
