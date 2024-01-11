class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ansList = new ArrayList<>();
        sol(0, candidates, target, new ArrayList<>(), ansList);
        return ansList;
    }

    public static void sol(int ind, int[] arr, int target,List<Integer> ds, List<List<Integer>> ansList){
        if(target == 0){
            ansList.add(new ArrayList<>(ds));
            return;
        }

        for(int i= ind; i< arr.length; i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            ds.add(arr[i]);
            sol(i+1, arr, target-arr[i], ds, ansList);
            ds.remove(ds.size()-1);
        }
    }
}