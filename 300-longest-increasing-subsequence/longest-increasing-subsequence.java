class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int longest=1;
        for(int i=1; i<nums.length; i++){
            int temp=dp[i];
            for(int j=i-1; j>=0; j--){
                if(nums[j]<nums[i]){
                    temp = Math.max(temp, dp[j]+1);
                }
            }
            dp[i]=temp;
            longest = Math.max(dp[i], longest);
        }
        return longest;
    }
}