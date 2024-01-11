class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, ans, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }
    public void helper(int[] nums, List<List<Integer>> ans, List<Integer> group, boolean[] visited){
        if(group.size()==nums.length){
            ans.add(new ArrayList<>(group));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(visited[i] || i>0 && nums[i]==nums[i-1] && !visited[i-1]) continue;
            group.add(nums[i]);
            visited[i] = true;
            helper(nums, ans, group, visited);
            group.remove(group.size()-1);
            visited[i]=false;
        }
    }
}