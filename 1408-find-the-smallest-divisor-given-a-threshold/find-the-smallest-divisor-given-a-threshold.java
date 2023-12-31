class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int minDiv = Integer.MAX_VALUE;
        int l=1, r=Arrays.stream(nums).max().getAsInt();
        while(l<=r){
            int mid = (l+r)/2;
            if(isValid(nums, threshold, mid)){
                minDiv = Math.min(minDiv, mid);
                r=mid-1;
            }else l=mid+1;
        }
        return minDiv;
    }
    public boolean isValid(int[] nums, int threshold, int d){
        int temp = 0;
        for(int i=0; i<nums.length; i++){
            temp += Math.ceil((double)nums[i]/(double)d);
            if(temp > threshold) return false;
        }
        return true;
    }
}