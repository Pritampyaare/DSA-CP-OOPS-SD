class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l=0, r=n-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(target == nums[mid] || nums[l] == target || nums[r] == target) return true;
            if(nums[l] == nums[mid]) l++;
            //else if(nums[mid] == nums[r]) r--;
            else if(nums[mid] < target){
                if(nums[r] >= nums[mid] && nums[r] < target) r = mid-1;
                else l = mid+1;
            }else if(nums[mid] > target){
                if(nums[l] <= nums[mid] && nums[l] > target) l = mid+1;
                else r = mid-1;
            }
        }
        return false;
    }
}