class Solution {
    public int longestOnes(int[] nums, int k) {
        int flip = k, l=0, r=0, max=0, count=0;
        while(l<=r && r<nums.length){
            if(nums[r]==1){
                count++;
                max = Math.max(max, count);
                r++;
            }else{
                if(flip>0){
                    flip--; count++;
                    max = Math.max(max, count);
                    r++;
                }else{
                    if(nums[l]==0 && flip<k) flip++;
                    if(l==r){
                        r++; l++;
                    }
                    else{
                        l++; count--;
                    }
                }
            }
        }
        return max;
    }
}