class StockSpanner {
    Stack<Integer> stk;
    HashMap<Integer, Integer> map;
    int size = 0;
    
    public StockSpanner() {
        stk = new Stack<>();
        map = new HashMap<>();
    }
    
    public int next(int price) {
        while(!stk.isEmpty() && map.get(stk.peek())<=price) stk.pop();
        int ngl = stk.isEmpty() ? -1 : stk.peek();
        int ans = size-ngl;
        map.put(size, price);
        stk.push(size);
        size++;
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */