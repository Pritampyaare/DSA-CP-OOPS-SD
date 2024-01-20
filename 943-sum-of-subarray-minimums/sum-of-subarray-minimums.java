class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = 1000000007;
        int[] nsl = new int[n], nsr = new int[n];
        Stack<Integer> stk = new Stack<>();
        nsl[0] = -1;
        stk.push(0);
        for(int i=1; i<n; i++){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]) stk.pop();
            nsl[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        nsr[n-1] = n;
        stk.clear(); stk.push(n-1);
        for(int i=n-2; i>=0; i--){
            while(!stk.isEmpty() && arr[stk.peek()]>arr[i]) stk.pop();
            nsr[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }
        long ans = 0;
        for(int i=0; i<n; i++){
            ans = (ans + (long)arr[i]*(long)(i-nsl[i])*(long)(nsr[i]-i))%mod;
        }
        return (int)ans;
    }
}