class Solution {
    static int maxSum = Integer.MAX_VALUE;
    public boolean isValid(int mid, int[] nums, int m){
        int chunks = 0, i=0;
        while(i < nums.length){
            int val = 0;
            while(i < nums.length && nums[i] + val <= mid) val += nums[i++];
            chunks++;
        }
        return chunks <= m;
    }
    public int splitArray(int[] nums, int k) {
        int min = nums[0], sum = 0;
        for(int n: nums){
            min = Math.max(min, n);
            sum += n;
        }
        if(k == 1) return sum;
        int s = min, e = sum;
        min = Integer.MAX_VALUE;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isValid(mid, nums, k)){
                 e = mid-1;
                 min = Math.min(min, mid);
            }
            else s = mid+1;
        }
        System.out.println(s);
        return min;
    }
}