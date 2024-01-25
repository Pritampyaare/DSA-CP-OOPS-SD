class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length(), l=0, r=0, max=0;
        if(n==0) return 0;
        HashSet<Character> set = new HashSet<>();
        //set.add(s.charAt(0));
        while(r<n){
            set.add(s.charAt(r));
            max = Math.max(max, set.size());
            while(r+1<n && set.contains(s.charAt(r+1))){
                set.remove(s.charAt(l));
                l++;
            }
            r++;
        }
        return max;
    }
}