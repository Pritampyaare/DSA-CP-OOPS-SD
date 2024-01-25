class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length(), l2 = text2.length();
        int[][] dp = new int[l1+1][l2+1];
        for(int[] row: dp) Arrays.fill(row, -1);
        for(int i=0; i<=l1; i++) dp[i][0] = 0;
        for(int i=0; i<=l2; i++) dp[0][i] = 0;
        
        for(int i=1; i<=l1; i++){
            for(int j=1; j<=l2; j++){
                char ch1 = text1.charAt(i-1);
                char ch2 = text2.charAt(j-1);
                if(ch1 == ch2) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[l1][l2];
    }

    //Memoization
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int l1 = text1.length(), l2 = text2.length();
    //     int[][] dp = new int[l1][l2];
    //     for(int[] row: dp) Arrays.fill(row, -1);
    //     return helper(text1, text2, l1-1, l2-1, dp);
    // }

    // public int helper(String text1, String text2, int idx1, int idx2, int[][] dp){
        
    //     if(idx1 <0 || idx2 < 0) return 0;
    //     if(dp[idx1][idx2] != -1) return dp[idx1][idx2];

    //     char ch1 = text1.charAt(idx1);
    //     char ch2 = text2.charAt(idx2);

    //     if(ch1 == ch2){
    //         return dp[idx1][idx2] = 1 + helper(text1, text2, idx1-1, idx2-1, dp);
    //     }else{
    //         return dp[idx1][idx2] = Math.max(helper(text1, text2, idx1-1, idx2, dp), helper(text1, text2, idx1, idx2-1, dp));
    //     }
    // }
}