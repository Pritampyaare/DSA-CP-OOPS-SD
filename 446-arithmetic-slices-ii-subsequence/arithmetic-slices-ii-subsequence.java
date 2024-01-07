class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length, ans=0;
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        for(int i=0; i<n; i++) dp[i] = new HashMap<>();
        //Arrays.fill(dp, new HashMap<>());

        for(int i=1; i<n; i++){
            for(int j=i-1; j>=0; j--){
                long cdl = (long)nums[i]-(long)nums[j];
                if(cdl >= Integer.MAX_VALUE || cdl <= Integer.MIN_VALUE) continue;
                int cd = (int)cdl;
                if(dp[j].containsKey(cd)){
                    dp[i].put(cd, dp[j].get(cd)+dp[i].getOrDefault(cd,0)+1);
                    ans += dp[j].get(cd);
                }else{
                    dp[i].put(cd, dp[i].getOrDefault(cd, 0)+1);
                }
            }
        }
        return ans;
    }
}