class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        if(h < n) return -1;
        int r = Arrays.stream(piles).max().getAsInt(), l=1;
        int minK = Integer.MAX_VALUE;
        while(l<=r){
            int k = (l+r)/2;
            if(validK(piles, k, h)){
                minK = Math.min(minK, k);
                r=k-1;
            }else l=k+1;
        }
        return minK;
    }
    public boolean validK(int[] piles, int k, int h){
        int time = 0;
        for(int i=0; i<piles.length; i++){
            time += Math.ceil((double)piles[i]/(double)k);
            if(time>h) return false;
        }
        return true;
    }
}