import java.util.Scanner;
import java.util.TreeMap;

public class Q1_SortedMapKey{

    //Time Complexity: O(nlogn)
    //Space Complexity: O(n)
    //Tree Map insertion take: O(logn)
    public static void sortedMap(int n,Scanner sc){
        TreeMap<Integer,String> tm=new TreeMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+(i+1)+" key and value");
            int key=sc.nextInt();
            String value=sc.nextLine();
            tm.put(key,value);
        }

        System.out.println(tm);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of inputs");
        int n=sc.nextInt();

        sortedMap(n,sc);
        sc.close();
    }
}