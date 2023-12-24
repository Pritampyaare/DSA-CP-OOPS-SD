class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<n-3; i++){
            
            for(int j=i+1; j<n-2; j++){
                Set<Long> s = new HashSet<>();
                for(int k=j+1; k<n; k++){
                    if(s.contains((long)target-nums[i]-nums[j]-nums[k])){
                        res.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k], target-nums[i]-nums[j]-nums[k])));
                    }else{
                        s.add((long)nums[k]);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}