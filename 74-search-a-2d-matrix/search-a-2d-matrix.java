class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int left=0, right=row*col-1;

        while(left<=right){
            int mid=(left+right)/2;
            int r=mid/col, c=mid%col;
            if(matrix[r][c] == target) return true;
            if(target > matrix[r][c]) left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}