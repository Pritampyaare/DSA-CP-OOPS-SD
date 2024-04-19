class Solution {
    public int numIslands(char[][] arr) {
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == '1' && visited[i][j] == false){
                    count++;
                    getConComp(i,j,visited,arr);
                }
            }
        }
        return count;
    }
    public static void getConComp(int i, int j, boolean[][] visited, char[][] arr){
        if(i < 0 || j< 0 || i >= arr.length || j >= arr[0].length || visited[i][j] == true || arr[i][j] =='0')
            return;
        
        visited[i][j] = true;
        getConComp(i-1, j, visited, arr);
        getConComp(i+1, j, visited, arr);
        getConComp(i, j-1, visited, arr);
        getConComp(i, j+1, visited, arr);
    
       return;
   }
}