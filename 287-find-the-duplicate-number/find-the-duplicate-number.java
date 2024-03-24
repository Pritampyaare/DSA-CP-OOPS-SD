class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length, ans = 0;
        int[] fq = new int[n+1];
        
        for(int i=0; i<n; i++){
            fq[nums[i]] += 1;
            if(fq[nums[i]] == 2){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}