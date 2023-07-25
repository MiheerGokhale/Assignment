import java.util.Scanner;

public class Q1_LinearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of element in the array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number which you want to search");
        int x=sc.nextInt();

        int idx=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                idx=i;
                break;
            }
        }
        if (idx!=-1) {
            System.out.print("the index of the element is "+ idx);
        }
        else{
                System.out.println("element not found in a array");
        }
        sc.close();
    }
}