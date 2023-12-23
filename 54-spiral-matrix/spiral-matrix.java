class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l = 0, r = matrix[0].length-1, t = 0, d = matrix.length-1;
        ArrayList<Integer> res = new ArrayList<>();
        while(l<=r && t<=d){
            for(int i=l; i<=r; i++){
                res.add(matrix[t][i]);
            }
            t++;
            if(l > r || t > d) break;
            for(int j=t; j<=d; j++){
                res.add(matrix[j][r]);
            }
            r--;
            if(l > r || t > d) break;
            for(int k=r; k>=l; k--){
                res.add(matrix[d][k]);
            }
            d--;
            if(l > r || t > d) break;
            for(int m=d; m>=t; m--){
                res.add(matrix[m][l]);
            }
            l++;
            if(l > r || t > d) break;
        }
        return res;
    }
}