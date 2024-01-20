class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<num.length(); i++){
            while(!stk.isEmpty() && stk.peek()>num.charAt(i) && k>0){
                stk.pop(); k--;
            }
            stk.push(num.charAt(i));
        }
        while(k-->0) stk.pop();
        StringBuilder sb = new StringBuilder();
        while(stk.size()>0) sb.append(stk.pop());
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0') sb.deleteCharAt(0);
        return sb.toString();
    }
}