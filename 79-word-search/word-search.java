class Solution {
    static char[][] bard;
    static String word;
    public boolean exist(char[][] bard, String word) {
        this.bard = bard;
        this.word = word;
        for(int i=0; i<bard.length; i++){
            for(int j=0; j<bard[0].length; j++){
                boolean[][] visited = new boolean[bard.length][bard[0].length];
                if(helper(bard, word, i, j, 0, visited) == true) return true;
            }
        }
        return false;
    }
    private boolean helper(char[][] bard, String word, int row, int col, int idx, boolean[][] visited){
        if(row < 0 || row > bard.length-1 || col < 0 || col > bard[0].length-1 || visited[row][col] == true || bard[row][col] != word.charAt(idx)) return false;
        visited[row][col] = true;
        if(idx == word.length()-1) return true;
        boolean ans = false;
        ans = ans || helper(bard, word, row+1, col, idx+1, visited);
        ans = ans || helper(bard, word, row-1, col, idx+1, visited);
        ans = ans || helper(bard, word, row, col+1, idx+1, visited);
        ans = ans || helper(bard, word, row, col-1, idx+1, visited);
        if(ans == false) visited[row][col] = false;
        return ans;
    }
}