class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        Integer lsb = Integer.highestOneBit(left ^ right);

        int res = left;
        while(lsb != 0){
            int mask = ~lsb;
            res = res & mask;
            lsb = lsb>>1;
        }
        return res;
    }
}