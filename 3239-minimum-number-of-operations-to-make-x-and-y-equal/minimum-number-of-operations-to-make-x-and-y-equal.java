class Solution {
    public int minimumOperationsToMakeEqual(int x, int y) {
        
        if(x<=y) return y-x;
        
        int res = x-y;
        res = Math.min(res, 1+x%5+minimumOperationsToMakeEqual(x/5, y));
        res = Math.min(res, 1+5-x%5+minimumOperationsToMakeEqual(x/5+1, y));
        res = Math.min(res, 1+x%11+minimumOperationsToMakeEqual(x/11, y));
        res = Math.min(res, 1+11-x%11+minimumOperationsToMakeEqual(x/11+1, y));
        return res;
    }
}