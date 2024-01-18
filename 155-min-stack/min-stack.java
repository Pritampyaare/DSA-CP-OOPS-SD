class MinStack {
    class Pair{
        int val, min;
        Pair(int val, int min){
            this.val=val;
            this.min=min;
        }
    }
    Stack<Pair> stk;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        stk = new Stack<>();
    }
    
    public void push(int val) {
        min = Math.min(min, val);
        stk.push(new Pair(val, min));
    }
    
    public void pop() {
        Pair p = stk.pop();
        if(!stk.isEmpty()) min = stk.peek().min;
        else min = Integer.MAX_VALUE;
    }
    
    public int top() {
        Pair p = stk.peek();
        return p.val;
    }
    
    public int getMin() {
        Pair p = stk.peek();
        return p.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */