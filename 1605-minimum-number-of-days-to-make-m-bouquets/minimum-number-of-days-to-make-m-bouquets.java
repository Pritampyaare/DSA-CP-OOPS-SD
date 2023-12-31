class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l=1, r = Arrays.stream(bloomDay).max().getAsInt(), minDay = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l+r)/2;
            if(isValid(bloomDay, m, k, mid)){
                minDay = Math.min(minDay, mid);
                r=mid-1;
            }else l=mid+1;
        }
        return minDay == Integer.MAX_VALUE ? -1 : minDay;
    }
    public boolean isValid(int[] bloomDay, int m, int k, int d){
        int count=0, bouquets=0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i] <= d) count++;
            else{
                bouquets += count/k;
                count=0;
                if(bouquets >= m) return true;
            }
        }
        bouquets += count/k;
        return bouquets>=m;
    }
}