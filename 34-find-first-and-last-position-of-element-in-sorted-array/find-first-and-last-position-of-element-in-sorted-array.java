class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0, r=nums.length-1, first=-1, last=-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<target) l = mid+1;
            else if(nums[mid]>target) r = mid-1;
            else{
                first = mid;
                r = mid-1;
            }
        }
        l=0; r=nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<target) l = mid+1;
            else if(nums[mid]>target) r = mid-1;
            else{
                last = mid;
                l = mid+1;
            }
        }
        return new int[]{first, last};
    }
}