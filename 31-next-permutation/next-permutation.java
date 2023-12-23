class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                idx = i-1;
                break;
            }
        }
        System.out.println(idx);
        if(idx != -1){
            for(int i=nums.length-1; i>=0; i--){
            if(nums[i]>nums[idx]){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;
                }
            }
            for(int e: nums) System.out.print(e+" ");
        }
        
        idx++;
        int n = nums.length-1;
        while(idx<=n){
            int temp = nums[idx];
            nums[idx] = nums[n];
            nums[n] = temp;
            idx++; n--;
        }
    }
}