class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2002];
        HashSet<Integer> set = new HashSet<>();

        for(int e : arr) freq[e+1000]++;
        for(int e : freq){
            if(e==0) continue;
            if(set.contains(e)) return false;
            set.add(e);
        }
        return true;
    }
}