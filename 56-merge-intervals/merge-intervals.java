class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b)-> a[0]-b[0]);
        List<List<Integer>> merged = new ArrayList<>();
        int start = intervals[0][0], end = intervals[0][1];

        for(int i=1; i<n; i++){
            if(intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
            }else{
                merged.add(new ArrayList<>(List.of(start, end)));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        merged.add(new ArrayList<>(List.of(start, end)));
        int[][] ans = new int[merged.size()][2];
        for(int i=0; i<merged.size(); i++){
            ans[i][0] = merged.get(i).get(0);
            ans[i][1] = merged.get(i).get(1);
        }
        return ans;
    }
}