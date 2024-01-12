class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] possible = new boolean[n+1];
        possible[n] = true;
        for(int i=n-1; i>=0; i--){
            for(int j=i; j<=n; j++){
                if(possible[j]==true){
                    String word = s.substring(i, j);
                    if(set.contains(word)){
                        possible[i] = true;
                        break;
                    }
                }
            }
        }
        return possible[0];
    }
}