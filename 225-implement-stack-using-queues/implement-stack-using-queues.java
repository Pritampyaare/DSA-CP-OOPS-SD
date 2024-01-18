class MyStack {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    public MyStack() {
        mainQ = new ArrayDeque<>();
        helperQ = new ArrayDeque<>();
    }
    
    public void push(int x) {
        mainQ.add(x);
    }
    
    public int pop() {
        if(mainQ.isEmpty()){
          //System.out.println("Stack underflow");
          return -1;
      }
      while(mainQ.size() > 1){
          helperQ.add(mainQ.remove());
      }
      int rmv = mainQ.remove();
      while(helperQ.isEmpty() != true){
          mainQ.add(helperQ.remove());
      }
      return rmv;
    }
    
    public int top() {
        if(mainQ.isEmpty()){
          //System.out.println("Stack underflow");
          return -1;
      }
      while(mainQ.size() > 1){
          helperQ.add(mainQ.remove());
      }
      int pv = mainQ.remove();
      while(helperQ.isEmpty() != true){
          mainQ.add(helperQ.remove());
      }
      mainQ.add(pv);
      return pv;
    }
    
    public boolean empty() {
        return mainQ.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */