class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            ans[i] = prod;
            prod *= temp;
        }
        prod = 1;
        for(int i=nums.length-1; i>=0; i--){
            int temp = nums[i];
            ans[i] *= prod;
            prod *= temp;
        }
        return ans;
    }
}