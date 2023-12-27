class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length, i=0;
        while(i<n && nums[i] != 0 ) i++;
        int j=i;
        while(j<n){
            if(nums[j] != 0){
                nums[i++] = nums[j];
                nums[j] = 0;
            }
            j++;
        }
    }
}