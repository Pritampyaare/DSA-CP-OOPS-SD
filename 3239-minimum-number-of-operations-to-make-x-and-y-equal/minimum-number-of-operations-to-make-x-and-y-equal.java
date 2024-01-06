class Solution {
    public int minimumOperationsToMakeEqual(int x, int y) {
        int[] dp = new int[11000];
        Arrays.fill(dp, -1);
        
        return minimumOperationsToMakeEqualH(x, y, dp);
    }
    public int minimumOperationsToMakeEqualH(int x, int y, int[] dp) {
        
        if(x<=y) return y-x;
        if(dp[x]!=-1) return dp[x];
        int res = x-y;
        res = Math.min(res, 1+x%5+minimumOperationsToMakeEqualH(x/5, y, dp));
        res = Math.min(res, 1+5-x%5+minimumOperationsToMakeEqualH(x/5+1, y, dp));
        res = Math.min(res, 1+x%11+minimumOperationsToMakeEqualH(x/11, y, dp));
        res = Math.min(res, 1+11-x%11+minimumOperationsToMakeEqualH(x/11+1, y, dp));
        return dp[x]=res;
    }
}