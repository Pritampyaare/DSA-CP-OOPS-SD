class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,r=nums.length-1;

        while(l<=r){
            int mid = (l+r)/2;
            int left = mid-1 == -1 ? Integer.MIN_VALUE : nums[mid-1];
            int right = mid+1 == nums.length ? Integer.MIN_VALUE : nums[mid+1];
            if(left>nums[mid]) r = mid-1;
            else if(right > nums[mid]) l = mid+1;
            else return mid;
        }
        return -1;
    }
}