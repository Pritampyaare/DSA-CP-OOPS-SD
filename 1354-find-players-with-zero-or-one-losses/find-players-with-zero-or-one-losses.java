class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> lmap = new HashMap<>();
        HashSet<Integer> wset = new HashSet<>();
        for(int i=0; i<matches.length; i++){
            int winer = matches[i][0], losser = matches[i][1];
            if(!lmap.containsKey(winer)) wset.add(winer);
            if(wset.contains(losser)) wset.remove(losser);
            lmap.put(losser, lmap.getOrDefault(losser, 0)+1);
        }
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> winners = new ArrayList<>(wset);
        List<Integer> lossers = new ArrayList<>();
        for(int k: lmap.keySet()) if(lmap.get(k)==1) lossers.add(k);
        Collections.sort(winners); Collections.sort(lossers);
        res.add(winners); res.add(lossers);
        return res;
    }
}