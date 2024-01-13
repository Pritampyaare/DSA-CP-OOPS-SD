class Solution {
    public int minSteps(String s, String t) {
        int[] freqs = new int[26], freqt = new int[26], visited = new int[26];
        for(int i=0; i<s.length(); i++){
            freqs[s.charAt(i)-'a']++;
            freqt[t.charAt(i)-'a']++;
        }
        int changes=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(visited[ch-'a']==1) continue;
            changes += (freqs[ch-'a']-freqt[ch-'a']<0 ? 0: freqs[ch-'a']-freqt[ch-'a']);
            visited[ch-'a']=1;
        }
        return changes;
    }
}