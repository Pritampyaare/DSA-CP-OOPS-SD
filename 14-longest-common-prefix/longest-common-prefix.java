class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for(int i=0; i<strs.length; i++){
            int idx=0;
            while(idx<prefix.length() && idx<strs[i].length() && prefix.charAt(idx)==strs[i].charAt(idx)) idx++;
            prefix = prefix.substring(0,idx);
            if(prefix.length()==0) return "";
        }
        return prefix;
    }
}