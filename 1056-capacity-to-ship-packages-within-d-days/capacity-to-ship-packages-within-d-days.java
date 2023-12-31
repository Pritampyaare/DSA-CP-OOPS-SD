class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minWeight = Integer.MAX_VALUE;
        int l=Arrays.stream(weights).max().getAsInt(), r=Arrays.stream(weights).sum();

        while(l<=r){
            int mid = (l+r)/2;
            if(isValid(weights, days, mid)){
                minWeight = Math.min(minWeight, mid);
                r=mid-1;
            }else l=mid+1;
        }
        return minWeight;
    }
    public boolean isValid(int[] weights, int days, int weight){
        int sum=0;
        for(int i=0; i<weights.length; i++){
            sum += weights[i];
            if(sum>weight){
                days--;
                if(days<0) return false;
                sum = weights[i];
            }
        }
        if(sum>0) days--;
        return days>=0;
    }
}