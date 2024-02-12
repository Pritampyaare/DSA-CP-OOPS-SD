class Solution {
    public int majorityElement(int[] nums) {
        int e = nums[0], count = 1;
        for(int i=1; i<nums.length; i++){
            if(count == 0) e = nums[i];
            if(nums[i] == e) count++;
            else count--;
        }
        return e;
    }
}