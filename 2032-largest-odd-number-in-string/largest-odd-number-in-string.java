class Solution {
    public String largestOddNumber(String num) {
        int idx=num.length()-1;
        while(idx>=0){
            if((num.charAt(idx)-'0')%2 !=0) return num.substring(0,idx+1);
            idx--;
        }
        return "";
    }
}