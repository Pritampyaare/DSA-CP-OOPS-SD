class Solution {
    public boolean checkValidString(String s) {
        
        int cmax = 0, cmin = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                cmax++; cmin++;
            }else if(ch == ')'){
                cmax--; cmin--;
            }else{
                cmax++; cmin--;
            }
            if(cmax < 0) return false;
            cmin = Math.max(cmin, 0);
        }
        return cmin==0;
    }
}