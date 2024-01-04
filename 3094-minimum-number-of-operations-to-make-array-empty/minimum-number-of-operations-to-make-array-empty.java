class Solution {
    public int minOperations(int[] nums) {
        int[] freq = new int[1000001];
        HashSet<Integer> set = new HashSet<>();
        for(int e: nums){
            freq[e]++;
            set.add(e);
        } 
        int count=0;
        for(Integer i: set){
            if(freq[i]==1) return -1;
            count += freq[i]/3;
            if(freq[i]%3!=0) count++;
        }
        return count;
    }
}