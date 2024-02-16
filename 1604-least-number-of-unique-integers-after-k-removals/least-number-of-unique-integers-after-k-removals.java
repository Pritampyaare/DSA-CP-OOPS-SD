class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int e: arr) hmap.put(e, hmap.getOrDefault(e, 0)+1);
        List<Integer> nums = new ArrayList<>(hmap.keySet());
        nums.sort((a,b) -> hmap.get(b)-hmap.get(a));
        while(nums.size()>0){
            int ele = nums.get(nums.size()-1);
            if(hmap.get(ele)<=k){
                k -= hmap.get(ele);
                nums.removeLast();
            }else break;
        }
        return nums.size();
    }
}