public class Q1_MiniProduct {
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public  static int miniProduct(int[] A, int[] B, int k){
        int diff=0,result=0,temp=0;

        for (int i = 0; i < A.length; i++) {
            int product=A[i]*B[i];//real product before change
            result+=product;

            //what product would be if 2*k is added or subtracted to decrease product
            if (product<0 & B[i]<0){
                temp=(A[i]+2*k)*B[i];
            }
            else if (product<0 & A[i]<0){
                temp=(A[i]-2*k)*B[i];
            }
            else if (product>0 & A[i]<0){//means B[i]<0
                temp=(A[i]+2*k)*B[i];
            }
            else if (product>0 & A[i]>0){//means B[i]>0
                temp=(A[i]-2*k)*B[i];
            }

            int d=Math.abs(product-temp);
            if (d>diff){
                diff=d;//maximum product difference
            }
        }

        return result-diff;//smallest sum of product by subtracting original product to maximum difference
    }
    public static void main(String[] args) {
        int[] A ={2,3,4,5,4};
        int[] B ={3,4,2,3,2};
        int k=3;

        System.out.println("Smallest product is: "+miniProduct(A,B,k));
    }
}
