class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int preSum = 0;
        freq.put(0,1);
        int res=0;
        for(int i=0;i<nums.length;i++){
            preSum += nums[i];
            res += freq.getOrDefault(preSum-k,0);
            freq.put(preSum,freq.getOrDefault(preSum,0)+1);
        }
        return res;
    }
}