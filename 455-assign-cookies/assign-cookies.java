class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); Arrays.sort(s);
        int count=0, children=g.length-1, cookie=s.length-1;

        while(children>=0 && cookie>=0){
            if(g[children] <= s[cookie]){
                count++; cookie--; children--;
            }else children--;
        }
        return count;
    }
}