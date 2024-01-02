class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e: nums) map.put(e, map.getOrDefault(e,0)+1);
        List<List<Integer>> ans = new ArrayList<>();
        while(map.size()>0){
            List<Integer> temp = new ArrayList<>();
            for(Integer e: map.keySet()) temp.add(e);
            for(Integer e: temp) {
                map.put(e, map.get(e)-1);
                if(map.get(e)==0) map.remove(e);
            }
            ans.add(temp);
        }
        return ans;
    }
}