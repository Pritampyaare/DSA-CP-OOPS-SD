class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length, l=0, r=nums.length-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] < target){
                if(nums[r] >= nums[mid] && nums[r] < target) r = mid-1;
                else l = mid+1;
            }else if(nums[mid] > target){
                if(nums[l] <= nums[mid] && nums[l] > target) l = mid+1;
                else r = mid-1;
            }else return mid;
        }
        return -1;
    }
}