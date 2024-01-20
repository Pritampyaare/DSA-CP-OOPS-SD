class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length, col = matrix[0].length, max=0;
        int[] height = new int[col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==0){
                    height[j]=matrix[i][j]-'0';
                }else{
                    if(matrix[i][j]!='0'){
                        height[j]+=matrix[i][j]-'0';
                    }else{
                        height[j]=matrix[i][j]-'0';
                    }
                }
            }
            max = Math.max(max, largestRectangleArea(height));
        }
        return max;
    }
    public int largestRectangleArea(int[] a) {
        int n=a.length;
        int[] nsl = new int[n], nsr = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<n; i++){
            while(!stk.isEmpty() && a[stk.peek()]>=a[i]) stk.pop();
            if(stk.isEmpty()){
                nsl[i] = i;
            }else{
                nsl[i] = i-stk.peek()-1;
            }
            stk.push(i);
        }
        stk.clear();
        for(int i=n-1; i>=0; i--){
            while(!stk.isEmpty() && a[stk.peek()]>=a[i]) stk.pop();
            if(stk.isEmpty()){
                nsr[i] = n-i-1;
            }else{
                nsr[i] = stk.peek()-1-i;
            }
            stk.push(i);
        }
        int max = 0;
        for(int i=0; i<n; i++){
            int l = nsr[i]+nsl[i]+1;
            max = Math.max(max, l*a[i]);
        }
        return max;
    }
}