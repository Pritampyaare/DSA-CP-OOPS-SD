class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], sum = nums[0];
        for(int i=1; i<nums.length; i++){
            if(sum > 0){
                sum += nums[i];
            }else{
                sum = nums[i];
            }

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}