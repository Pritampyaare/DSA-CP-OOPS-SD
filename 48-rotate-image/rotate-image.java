class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }   
            }
        }
        for(int i = 0; i<m; i++){
            reverse(matrix[i]);
        }
        
    }
    
    public void  reverse(int [] arr){
        int i =0, j=arr.length-1;
        while(i<=j){
            swap(arr,i,j);
            i++;j--;
        }
    }
    
    public void  swap(int []nums,int i , int j){
        int temp =  nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}