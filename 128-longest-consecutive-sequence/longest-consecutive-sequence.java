class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length, maxCount=1;
        if(n==0) return 0;
        HashMap<Integer, Boolean> hmap = new HashMap<>();
        for(int i=0; i<n; i++){
            hmap.put(nums[i], false);
        }
        for(int i=0; i<n; i++){
            if(hmap.containsKey(nums[i]+1) && !hmap.containsKey(nums[i]-1)){
                hmap.put(nums[i], true);
            }
        }
        for(int i=0; i<n; i++){
            int count = 1;
            if(hmap.get(nums[i])==true){
                int temp = nums[i]+1;
                while(hmap.containsKey(temp)){
                    temp++;
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}