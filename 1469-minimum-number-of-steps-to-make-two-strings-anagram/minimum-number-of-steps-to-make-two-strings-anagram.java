class Solution {
    public int minSteps(String s, String t) {
        if(s.equals(t)) return 0;
        int n=s.length(), ans=0;
        int[] freq = new int[26];
        for(int i=0; i<n; i++){
            freq[s.charAt(i)-'a']++; 
            freq[t.charAt(i)-'a']--;
        }
        for(int i: freq) if(i>0) ans+=i;
        return ans;
    }
}
