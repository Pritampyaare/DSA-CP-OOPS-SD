class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        HashSet<List<Integer>> ans = new HashSet<>();
        solve(ans, new ArrayList<>(), candidates, target, 0);
        return new ArrayList<>(ans);
    }
    public static void solve(HashSet<List<Integer>> ans, List<Integer> group, int[] candidates, int target, int idx){

        if(target==0){
            ans.add(new ArrayList<>(group));
            return;
        } 
        if(target<0 || idx==candidates.length) return;
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.addAll(group); al1.add(candidates[idx]);
        solve(ans, al1, candidates, target-candidates[idx], idx+1);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.addAll(group); al2.add(candidates[idx]);
        solve(ans, al2, candidates, target-candidates[idx], idx);
        ArrayList<Integer> al3 = new ArrayList<>();
        al3.addAll(group);
        solve(ans, al3, candidates, target, idx+1);
    }
}