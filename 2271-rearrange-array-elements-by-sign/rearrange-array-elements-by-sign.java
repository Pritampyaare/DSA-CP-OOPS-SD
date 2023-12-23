class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int i=0, j=0, k=0;
        while(k<nums.length){
            while(nums[i]<0) i++;
            while(nums[j]>0) j++;
            arr[k++] = nums[i++];
            arr[k++] = nums[j++];
        }
        return arr;
    }
}