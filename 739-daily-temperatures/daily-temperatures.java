class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack();
        int[] span = new int[temperatures.length];

        for(int i=span.length-1; i>=0; i--){
            while(!stk.isEmpty() && temperatures[stk.peek()] <= temperatures[i]){
                stk.pop();
            } 
            if(stk.isEmpty()) span[i] = 0;
            else span[i] = stk.peek() - i;
            stk.push(i);
        }
        return span;
    }
}