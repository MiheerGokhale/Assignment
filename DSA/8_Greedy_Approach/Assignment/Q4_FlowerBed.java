public class Q4_FlowerBed {
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public static boolean isPossible(int[] flowerBed,int n){
        for (int i = 0; i < flowerBed.length; i++) {
            if (i==0){
                if (flowerBed[i]==0 & flowerBed[i+1]==0){
                    flowerBed[i]=1;
                    n--;
                }
            }
            else if (i==flowerBed.length-1) {
                if (flowerBed[i]==0 & flowerBed[i-1]==0){
                    flowerBed[i]=1;
                    n--;
                }

            }
            else if (flowerBed[i]==0 & flowerBed[i-1]==0 & flowerBed[i+1]==0){
                flowerBed[i]=1;
                n--;
            }

            if (n==0){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] flowerBed={1,0,0,0,1};
        int n=2;

        System.out.println(isPossible(flowerBed,n));
    }
}
