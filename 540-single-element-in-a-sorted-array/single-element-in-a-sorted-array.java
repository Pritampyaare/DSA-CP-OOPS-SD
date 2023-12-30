class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        int r = nums.length-2, l = 0;

        while(l <=  r){
            int mid = (l+r)/2;
            if(mid%2 == 0){
                if(nums[mid] != nums[mid+1]){
                    r = mid - 1;
                }else{
                    l = mid+1;
                }
            }else{
                if(nums[mid] == nums[mid+1]){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }
        }
        return nums[l];
    }
}