class Solution {
    public int largestRectangleArea(int[] a) {
        int n=a.length;
        int[] nsl = new int[n], nsr = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<n; i++){
            while(!stk.isEmpty() && a[stk.peek()]>=a[i]) stk.pop();
            if(stk.isEmpty()){
                nsl[i] = i;
            }else{
                nsl[i] = i-stk.peek()-1;
            }
            stk.push(i);
        }
        stk.clear();
        for(int i=n-1; i>=0; i--){
            while(!stk.isEmpty() && a[stk.peek()]>=a[i]) stk.pop();
            if(stk.isEmpty()){
                nsr[i] = n-i-1;
            }else{
                nsr[i] = stk.peek()-1-i;
            }
            stk.push(i);
        }
        int max = 0;
        for(int i=0; i<n; i++){
            int l = nsr[i]+nsl[i]+1;
            max = Math.max(max, l*a[i]);
        }
        return max;
    }
}