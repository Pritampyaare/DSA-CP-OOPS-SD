class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2002];
        int[] occur = new int[1001];

        for(int e : arr) freq[e+1000]++;
        for(int e : freq){
            if(e==0) continue;
            if(occur[e] != 0) return false;
            occur[e] = 1;
        }
        return true;
    }
}