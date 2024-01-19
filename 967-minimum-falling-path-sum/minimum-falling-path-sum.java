class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i-1 < 0){
                    dp[i][j] = matrix[i][j];
                    continue;
                }
                int min = dp[i-1][j];
                if(j-1 >=0) min = Math.min(dp[i-1][j-1], min);
                if(j+1 <n) min = Math.min(dp[i-1][j+1], min);
                dp[i][j] = matrix[i][j]+min;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            min = Math.min(dp[n-1][i], min);
        }
        return min;
    }
}