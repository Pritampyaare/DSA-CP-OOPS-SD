class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] arr = new int[100001];
        //for winner mark 1, for losser mark -1 or decrement if already losser
        for(int i=0; i<matches.length; i++){
            int winner = matches[i][0], losser = matches[i][1];
            if(arr[winner]>-1) arr[winner]=1; //mark winner only if not marked as losser
            arr[losser] = arr[losser]>0 ? -1 : arr[losser]-1; //mark -1 or decrement
        }
        List<Integer> winnersList = new ArrayList<>(), lossersList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0) winnersList.add(i);
            else if(arr[i]==-1) lossersList.add(i);
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(winnersList); res.add(lossersList);
        return res;
    }
}