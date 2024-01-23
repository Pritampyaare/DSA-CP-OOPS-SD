class Solution {
    int max = 0;
    public int maxLength(List<String> arr) {
        helper(arr, "", 0);
        return max;
    }
    public void helper(List<String> arr, String s, int index){
        if(index==arr.size()){
            max = Math.max(max, s.length());
            return;
        }
        if(isValid(s, arr.get(index))){
            helper(arr, s+arr.get(index), index+1);
        }
        helper(arr, s, index+1);
    }
    public boolean isValid(String s1, String s2){
        HashSet<Character> set2 = new HashSet<>();
        for(char ch: s2.toCharArray()){
            if(set2.contains(ch)) return false;
            set2.add(ch);
        }
        for(char ch: s1.toCharArray()){
            if(set2.contains(ch)) return false;
        }
        return true;
    }
}