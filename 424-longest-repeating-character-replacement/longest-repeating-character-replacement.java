class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, ans = 0;
        char me = s.charAt(0);
        for(int end = 0; end<s.length(); end++){
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            if(map.get(ch) >= map.get(me)) me = ch;
            if(end-start+1 - map.get(me) > k){
                char stch = s.charAt(start);
                map.put(stch, map.get(stch)-1);
                start++;
            }
            ans = Math.max(ans, end-start+1);
        }
        return ans;
    }
}