import java.util.Arrays;

public class NQueens {
    public static int nQueens(boolean board[][],int row,int queen){
        //base case condition
        if (queen==0 && row==board.length) {
            return 1;
        }

        int count=0;

        //for each queen check each position in a row
        for (int col = 0; col < board.length; col++) {
            //check if placing queen on row and col are safe or not
            if (isSafe(board, row, col)) {
                //place queen in row and col
                board[row][col]=true;
                
                count=count+nQueens(board, row+1,queen-1);

                //backtrack
                board[row][col]=false;
            }
        }

        return count;
    }

    public static boolean isSafe(boolean board[][],int row,int col){
        //check if queen present in vertical/column col or not
        for(int i=row;i>=0;i--){
            if (board[i][col]) {
                return false;
            }
        }

        //check if queen present in left diagonal or not
        for (int i = row,j=col; i>=0 && j>=0; i--,j--) {
            if (board[i][j]) {
                return false;
            }
        }

        //check if queen present in right diagonal or not
        for (int i = row,j=col;i>=0 && j<=board.length-1; i--,j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int n=5;
        boolean board[][]=new boolean[n][n];
        System.out.println(nQueens(board, 0, n));
    }
}
