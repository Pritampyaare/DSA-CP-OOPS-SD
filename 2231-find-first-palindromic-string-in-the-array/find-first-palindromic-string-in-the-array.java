class Solution {
    public String firstPalindrome(String[] words) {
        String pal = "";
        for(String str: words){
            if(isValid(str)){
                return str;
            }
        }
        return pal;
    }
    private boolean isValid(String str){
        int i=0, j=str.length()-1;
        while(i<j) if(str.charAt(i++)!=str.charAt(j--)) return false;
        return true;
    }
}