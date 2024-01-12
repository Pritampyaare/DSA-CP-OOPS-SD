class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(find(board, word, visited, i, j, 0)) return true;
            }
        }
        return false;
    }
    public boolean find(char[][] board, String word, boolean[][] visited, int row, int col, int idx){
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col] != word.charAt(idx) || visited[row][col]) return false;
        visited[row][col] = true;
        if(idx==word.length()-1) return true;
        boolean ans = find(board, word, visited, row+1, col, idx+1);
        ans = ans || find(board, word, visited, row-1, col, idx+1);
        ans = ans || find(board, word, visited, row, col+1, idx+1);
        ans = ans || find(board, word, visited, row, col-1, idx+1);
        visited[row][col] = false;
        return ans;
    }
}