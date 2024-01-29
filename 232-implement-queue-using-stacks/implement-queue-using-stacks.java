class MyQueue {

    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public MyQueue() {
        mainS = new Stack<>();
        helperS = new Stack<>();
    }
    
    public void push(int x) {
        mainS.push(x);
    }
    
    public int pop() {
        if(mainS.isEmpty()){
          System.out.println("Queue underflow");
          return -1;
      }
      while(mainS.isEmpty() != true){
          helperS.push(mainS.pop());
      }
      int rmv = helperS.pop();
      while(helperS.isEmpty() != true){
          mainS.push(helperS.pop());
      }
      return rmv;
    }
    
    public int peek() {
        if(mainS.isEmpty()){
          System.out.println("Queue underflow");
          return -1;
      }
      while(mainS.isEmpty() != true){
          helperS.push(mainS.pop());
      }
      int pv = helperS.peek();
      while(helperS.isEmpty() != true){
          mainS.push(helperS.pop());
      }
      return pv;
    }
    
    public boolean empty() {
        return mainS.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */