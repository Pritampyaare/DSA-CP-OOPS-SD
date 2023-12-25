class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], prefix = 1, n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                max = Math.max(max, 0);
                prefix = 1;
                continue;
            }
            prefix *= nums[i];
            max = Math.max(max, prefix);
        }
        prefix = 1;
        for(int i=n-1; i>=0; i--){
            if(nums[i] == 0){
                max = Math.max(max, 0);
                prefix = 1;
                continue;
            }
            prefix *= nums[i];
            max = Math.max(max, prefix);
        }
        return max;
    }
}