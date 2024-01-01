class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map = new int[256];
        Arrays.fill(map, -1);
        boolean[] visited = new boolean[256];
        for(int i=0; i<s.length(); i++){
            if(map[s.charAt(i)] == -1){
                if(visited[t.charAt(i)] == true) return false;
                map[s.charAt(i)] = t.charAt(i);
                visited[t.charAt(i)]=true;
            }else{
                if(map[s.charAt(i)]!=t.charAt(i)) return false;
            }
        }
        return true;
    }
}