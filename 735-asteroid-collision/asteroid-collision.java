class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<n; i++){
            if(stk.isEmpty() || asteroids[i]>0){
                stk.push(asteroids[i]);
            }else{
                while(true){
                    if(stk.isEmpty() || stk.peek()<0){
                        stk.push(asteroids[i]);
                        break;
                    }
                    if(stk.peek()>Math.abs(asteroids[i])){
                        break;
                    }else if(stk.peek()==Math.abs(asteroids[i])){
                        stk.pop(); break;
                    }else{
                        stk.pop();
                    }
                }
            }
        }
        int[] ans = new int[stk.size()];
        int i=ans.length-1;
        while(stk.size()>0) ans[i--]=stk.pop();
        return ans;
    }
}