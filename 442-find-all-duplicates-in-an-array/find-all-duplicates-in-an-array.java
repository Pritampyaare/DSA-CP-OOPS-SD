class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        boolean[] freq = new boolean[n+1];
        List<Integer> res = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int e = nums[i];
            if(freq[e]==false) freq[e] = true;
            else res.add(e);
        }
        return res;
    }
}