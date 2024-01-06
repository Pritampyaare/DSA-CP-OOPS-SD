class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = profit.length;
        int[][] job = new int[n][3];
        for(int i=0; i<n; i++){
            job[i][0]=startTime[i]; job[i][1]=endTime[i]; job[i][2]=profit[i];
        }
        Arrays.sort(job, (a,b)-> a[0]-b[0]);
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return jobSchedulingHelper(job, 0, memo);
    }
    public int jobSchedulingHelper(int[][] job, int idx, int[] memo){
        if(idx==job.length) return 0;
        if( memo[idx] != -1) return memo[idx];
        int pick = job[idx][2]+jobSchedulingHelper(job, findNext(idx, job), memo);
        int skip = jobSchedulingHelper(job, idx+1, memo);
        return memo[idx]=Math.max(pick, skip);
    }
    private int findNext(int cur, int[][] jobs) {
        for (int next = cur + 1; next < jobs.length; next++) {
            if (jobs[next][0] >= jobs[cur][1]) {
                return next;   
            }
        }
        return jobs.length;
    }
}