class Solution {
    private boolean isValid(char[][] board, int row, int col, char val){
        for(int i=0; i<9; i++){
            if(board[row][i] == val || board[i][col] == val) return false;
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[((row/3) * 3) + i][((col/3) * 3) + j] == val) return false;
            }
        }
        return true;
    }
    public static char[][] ans;
    public void solveSudoku(char[][] board) {
        ans = new char[9][9];
        helper(board, 0, 0);
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                board[i][j] = ans[i][j];
            }
        }
    }
    public void helper(char[][] board, int row, int col){
        if(row == 9){
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    ans[i][j] = board[i][j];
                }
            }
            return;
        }
        if(col == 9){
            helper(board, row+1, 0);
            return;
        }
        if(board[row][col] == '.'){
            for(char i='1'; i<='9'; i++){
                if(isValid(board, row, col, i)){
                    board[row][col] = i;
                    helper(board, row, col+1);
                    board[row][col] = '.';
                }
            }
        }else helper(board, row, col+1);
        
    }
}