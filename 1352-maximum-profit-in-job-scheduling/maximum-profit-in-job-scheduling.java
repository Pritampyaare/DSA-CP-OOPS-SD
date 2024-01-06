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
        int pick = job[idx][2]+jobSchedulingHelper(job, findNext(job, idx), memo);
        int skip = jobSchedulingHelper(job, idx+1, memo);
        return memo[idx]=Math.max(pick, skip);
    }
    private int findNext(int[][] jobs, int idx) {
        int lo = idx + 1;
        int hi = jobs.length -1;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(jobs[mid][0] >= jobs[idx][1]) {
                if(jobs[mid-1][0] >= jobs[idx][1])
                    hi = mid - 1;
                else 
                    return mid;
            } else {
                lo = mid + 1;
            }
        }
        
        return jobs.length;
    }
}