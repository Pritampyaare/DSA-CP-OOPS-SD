class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0; i<n-2; i++){
            int fix = nums[i];
            Set<Integer> s = new HashSet<>();
            for(int j=i+1; j<n; j++){
                if(s.contains(-fix-nums[j])){
                    res.add(new ArrayList<>(List.of(fix, nums[j], -fix-nums[j])));
                }else s.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}