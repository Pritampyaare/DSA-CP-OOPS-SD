class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, ans, new ArrayList<>());
        return ans;
    }
    public void helper(int[] nums, List<List<Integer>> ans, List<Integer> group){
        if(group.size()==nums.length){
            ans.add(new ArrayList<>(group));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!group.contains(nums[i])){
                group.add(nums[i]);
                helper(nums, ans, group);
                group.remove(group.size()-1);
            }
        }
    }
}