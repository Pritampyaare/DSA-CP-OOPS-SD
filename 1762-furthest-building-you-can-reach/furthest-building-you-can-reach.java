class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b) -> b.diff-a.diff);
        int reach=0;
        pq.add(new Pair(0, 0));
        for(int i=1; i<heights.length; i++){
            int diff = heights[i]-heights[i-1];
            diff = diff>0 ? diff : 0;
            if(diff <= bricks){
                bricks -= diff;
                reach++;
                pq.add(new Pair(i, diff));
            }else{
                if(ladders==0) break;
                else{
                    if(diff > pq.peek().diff){
                        ladders--; reach++;
                        pq.add(new Pair(i, 0));
                    }else{
                        Pair p = pq.remove();
                        bricks += p.diff;
                        bricks -= diff;
                        ladders--; reach++;
                        pq.add(new Pair(i, diff));
                    }
                }
            }
        }
        return reach;
    }
}
class Pair{
    int idx;
    int diff;

    Pair(int idx, int diff){
        this.idx = idx;
        this.diff = diff;
    }
}