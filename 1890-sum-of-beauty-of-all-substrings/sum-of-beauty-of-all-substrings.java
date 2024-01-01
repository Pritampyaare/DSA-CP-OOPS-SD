class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            int[] freq = new int[26];
            for(int j=i; j<s.length(); j++){
                freq[s.charAt(j)-'a']++;
                ans += getBeauty(freq);
            }
        }
        return ans;
    }
    public int getBeauty(int[] freq){
        int min=Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0; i<26; i++){
            if(freq[i]==0) continue;
            min = Math.min(min, freq[i]);
            max = Math.max(max, freq[i]);
        }
        return max-min;
    }
}