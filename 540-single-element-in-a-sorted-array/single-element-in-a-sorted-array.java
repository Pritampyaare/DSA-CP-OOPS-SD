class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l=0, r=n-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(mid==n-1 || mid==0 || (nums[mid-1] != nums[mid] && nums[mid+1] != nums[mid])) return nums[mid];
            if(mid%2 == 0){
                if(nums[mid] == nums[mid+1]) l=mid+1;
                else r=mid-1;
            }else{
                if(nums[mid]==nums[mid-1]) l=mid+1;
                else r=mid-1;
            }
        }
        return nums[l];
    }
}