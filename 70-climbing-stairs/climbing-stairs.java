class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int p = 2, pp = 1, ans = 2;
        for(int i=3; i<=n; i++){
            ans = pp+p;
            pp = p;
            p = ans;
        }
        return ans;
    }
}