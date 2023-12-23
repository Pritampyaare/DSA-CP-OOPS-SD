class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);
        for(int i: nums){
            int max_val=1, preVal=i-1, nextVal=i+1;
            while(set.contains(preVal)){
                max_val++;
                set.remove(preVal--);
            }
            while(set.contains(nextVal)){
                max_val++;
                set.remove(nextVal++);
            }
            res = Math.max(res, max_val);
        }
        return res;
    }
}