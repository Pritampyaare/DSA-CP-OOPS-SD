class Solution {
    public int maxDepth(String s) {
        int maxNesting = 0, count=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
                maxNesting = Math.max(maxNesting, count);
            } 
            else if(ch == ')') count--;
        }
        return maxNesting;
    }
}