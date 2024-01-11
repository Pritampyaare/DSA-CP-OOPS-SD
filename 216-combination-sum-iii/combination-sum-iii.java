class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(k, n, ans, new ArrayList<>(), 1);
        return ans;
    }
    public void helper(int k, int n, List<List<Integer>> ans, List<Integer> group, int idx){
        if(n<0 || group.size()>k) return;
        if(n==0 && k==group.size()){
            ans.add(new ArrayList<>(group));
            return;
        }
        for(int i=idx; i<=9; i++){
            group.add(i);
            helper(k, n-i, ans, group, i+1);
            group.remove(group.size()-1);
        }
    }
}