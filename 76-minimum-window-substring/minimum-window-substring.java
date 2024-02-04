class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tmap = new HashMap<>();
        for(char c: t.toCharArray()) tmap.put(c, tmap.getOrDefault(c, 0)+1);
        int start = 0, min = Integer.MAX_VALUE, count = 0;
        String res = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int end=0; end<s.length(); end++){
            char ch = s.charAt(end);
            if(tmap.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch, 0)+1);
                if(map.get(ch) <= tmap.get(ch)) count++;
            }
            while(count == t.length()){
                if(min > end-start+1){
                    min = end-start+1;
                    res = s.substring(start, end+1);
                }
                char stch = s.charAt(start);
                if(tmap.containsKey(stch)){
                    if(map.get(stch) <= tmap.get(stch)) count--;
                    map.put(stch, map.get(stch)-1);
                }
                start++;
            }
        }
        return res;
    }
}