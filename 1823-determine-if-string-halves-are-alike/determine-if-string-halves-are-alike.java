class Solution {
    HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public boolean halvesAreAlike(String s) {
        return check(s, 0, s.length()/2-1)==check(s, s.length()/2, s.length()-1);
    }
    public int check(String s, int start, int end){
        int count=0;
        for(int i=start; i<=end; i++){
            if(set.contains(s.charAt(i))) count++;
        }
        return count;
    }
}