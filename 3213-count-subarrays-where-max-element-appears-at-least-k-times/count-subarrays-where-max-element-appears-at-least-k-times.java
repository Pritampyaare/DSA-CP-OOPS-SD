class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxNum = nums[0], n = nums.length;
        for(int e : nums) maxNum = Math.max(maxNum, e);
        
        int i = 0, j = 0;
        long ans = 0; 
        int count = nums[0]==maxNum ? 1 : 0;

        while(i < n && j < n){
            if(count >= k){
                ans += n-j;
                i++;
                if(i<n && nums[i-1]==maxNum) count--;
            }else{
                j++;
                if(j<n && nums[j]==maxNum) count++;
            }
        }
        return ans;
    }
}