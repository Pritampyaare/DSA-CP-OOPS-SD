class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s, ans, new ArrayList<>(), 0);
        return ans;
    }
    public void helper(String s, List<List<String>> ans, List<String> group, int idx){
        if(idx==s.length()){
            ans.add(new ArrayList<>(group));
            return;
        }
        for(int i=idx; i<s.length(); i++){
            if(isPalindrome(s, idx, i)){
                group.add(s.substring(idx, i+1));
                helper(s, ans, group, i+1);
                group.remove(group.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++; end--;
        }
        return true;
    }
}