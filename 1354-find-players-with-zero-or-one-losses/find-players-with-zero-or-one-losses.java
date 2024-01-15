class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] arr = new int[100001];
        
        for(int i=0; i<matches.length; i++){
            int winner = matches[i][0], losser = matches[i][1];
            if(arr[winner]>-1) arr[winner]=1;
            arr[losser] = arr[losser]>0 ? -1 : arr[losser]-1;
        }
        List<Integer> winners = new ArrayList<>(), lossers = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0) winners.add(i);
            else if(arr[i]==-1) lossers.add(i);
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(winners); res.add(lossers);
        return res;
    }
}