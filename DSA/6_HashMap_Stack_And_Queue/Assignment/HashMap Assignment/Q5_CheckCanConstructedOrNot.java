import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5_CheckCanConstructedOrNot {

    //Time Complexity: (m+n)
    //Space Complexity: (m+n)
    public static boolean canConstructed(String r,String m){
        HashMap<Character,Integer> hmap1=new HashMap<>();
        HashMap<Character,Integer> hmap2=new HashMap<>();

        //hmap1 contain r character as key and its no. of times as value
        for (int i = 0; i < r.length(); i++) {
            if (hmap1.containsKey(r.charAt(i))) {
                hmap1.put(r.charAt(i), hmap1.get(r.charAt(i))+1);
            }
            else{
                hmap1.put(r.charAt(i), 1);
            }
        }
        
        //hmap2 contain m character as key and its no. of times as value
        for (int i = 0; i < m.length(); i++) {
            if (hmap2.containsKey(m.charAt(i))) {
                hmap2.put(m.charAt(i), hmap2.get(m.charAt(i))+1);
            }
            else{
                hmap2.put(m.charAt(i), 1);
            }
        }

        for (Map.Entry<Character,Integer> e : hmap1.entrySet()) {
            //if magzine don't have ransomNote character and it's value equal
            if (!hmap2.containsKey(e.getKey()) || hmap1.get(e.getKey()) != hmap2.get(e.getKey())) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the ransomNote String:");
        String r=sc.nextLine();

        System.out.println("Enter the magazine String:");
        String m=sc.nextLine();

       System.out.println(canConstructed(r, m));

       sc.close();
    }
}
