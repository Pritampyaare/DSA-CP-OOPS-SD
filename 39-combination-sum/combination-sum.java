class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        sol(0, candidates, target, new ArrayList<>(), ansList);
        return ansList;
    }

    public static void sol(int ind, int[] arr, int target, List<Integer> ds, List<List<Integer>> ansList){
        
        if(target < 0) return;
        if(target == 0){
            ansList.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind; i<arr.length; i++){
            ds.add(arr[i]);
            sol(i, arr, target-arr[i], ds, ansList);
            ds.remove(ds.size()-1);
        }
    }
}