class Solution {
    public int lengthOfLIS(int[] nums) {
        int ls=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[ls]){
                ls++;
                nums[ls]=nums[i];
            }else{
                int pos = Arrays.binarySearch(nums, 0, ls, nums[i]);
                if(pos<0) pos = -pos-1;
                nums[pos]=nums[i];
            }
        }
        return ls+1;
    }
}