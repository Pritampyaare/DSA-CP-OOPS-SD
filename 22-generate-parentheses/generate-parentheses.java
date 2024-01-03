class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lstr = new ArrayList<>();
        return generateParenthesisHelper(n, 0, 0, "", lstr);
    }
    public List<String> generateParenthesisHelper(int n, int opening, int closing, String str, List<String> lstr){
        if(closing==n && opening==n){
            lstr.add(str);
            return lstr;
        }
        if(closing<opening) generateParenthesisHelper(n, opening, closing+1, str+")", lstr);
        if(opening<n) generateParenthesisHelper(n, opening+1, closing, str+"(", lstr);
        return lstr;
    }
}