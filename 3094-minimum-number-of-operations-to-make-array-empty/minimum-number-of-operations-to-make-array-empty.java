class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e: nums) map.put(e, map.getOrDefault(e,0)+1);
        int count=0;
        for(Integer i: map.keySet()){
            if(map.get(i)==1) return -1;
            count += map.get(i)/3;
            if(map.get(i)%3!=0) count++;
        }
        return count;
    }
}