class Solution {
    List<List<String>> ans = new ArrayList<>();
    private boolean isValid(char[][] board, int row, int col){
        for(int i=0; i<board.length; i++)  //column
            if(board[i][col] == 'Q') return false;
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) // upper left diagonal
            if(board[i][j] == 'Q') return false;
        for(int i=row-1, j=col+1; i>=0 && j<board[0].length; i--, j++) // upper right diagonal
            if(board[i][j] == 'Q') return false;
        for(int i=row+1, j=col-1; i<board.length && j>=0; i++, j--)  // lower left diagonal
            if(board[i][j] == 'Q') return false;
        for(int i=row+1, j=col+1; i<board.length && j<board[0].length; i++, j++) // lower right diagonal
            if(board[i][j] == 'Q') return false;  
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] arr: board) Arrays.fill(arr, '.');
        helper(board, 0);
        return ans;
    }
    public void helper(char[][] board, int row){
        if(row==board.length){
            ans.add(construct(board));
            return;
        }
        for(int i=0; i<board[0].length; i++){
            if(isValid(board, row, i)){
                board[row][i] = 'Q';
                helper(board, row+1);
                board[row][i] = '.';
            }
        }
        return;
    }
    public List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    
}