class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] pre = new int[n];
        Arrays.sort(nums);
        Arrays.fill(dp, 1); Arrays.fill(pre, -1);
        int maxIdx = -1;
        for(int i=0; i<n; i++){
            for(int j = i-1; j>=0; j--){
                if(nums[i] % nums[j] == 0 && dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                    pre[i] = j;
                    
                }
            }
            if(maxIdx == -1 || dp[maxIdx] < dp[i]) maxIdx = i;
        }
        List<Integer> res = new ArrayList<>();
        int index = maxIdx;
        while(index != -1){
            res.add(nums[index]);
            index = pre[index];
        }
        return res;
    }
}