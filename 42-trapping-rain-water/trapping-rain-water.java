class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] lm = new int[n], rm = new int[n];
        int lMax = -1;
        for(int i=0; i<n; i++){
            lm[i] = lMax;
            lMax = Math.max(lMax, height[i]);
        }
        int rMax = -1;
        for(int i=n-1; i>=0; i--){
            rm[i] = rMax;
            rMax = Math.max(rMax, height[i]);
        }
        int water = 0;
        for(int i=0; i<n; i++){
            if(lm[i]<height[i] || rm[i]<height[i]) continue;
            water += Math.min(lm[i], rm[i])-height[i];
        }
        return water;
    }
}