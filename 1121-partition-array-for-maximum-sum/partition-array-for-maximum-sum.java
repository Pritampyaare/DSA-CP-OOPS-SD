class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[][] dp = new int[arr.length][arr.length];
        return mcm(arr, 0, arr.length-1, k, dp);
    }
    public int mcm(int[] arr, int start, int end, int k, int[][] dp){
        if(start > end) return 0;
        if(dp[start][end] != 0) return dp[start][end];
        int maxi = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=start; i<=end && i<start+k; i++){
            max = Math.max(max, arr[i]);
            int cost = max*(i-start+1) + mcm(arr, i+1, end, k, dp); 
            if(cost > maxi) maxi = cost;
        }
        return dp[start][end] = maxi;
    }
}