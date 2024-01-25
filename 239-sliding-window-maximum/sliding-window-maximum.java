class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ngr = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!stk.isEmpty() && nums[stk.peek()]<= nums[i]) stk.pop();
            ngr[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }
        int l=0, r=k-1, max=nums[0], i=0, j=0;
        int[] ans = new int[n-k+1];
        while(r<n){
            while(ngr[i]<=r){
                i=ngr[i];
                max = Math.max(max, nums[i]);
            }
            ans[j++]=max;
            l++; r++;
            if(i<l && l<n){
                i=l;
                max = nums[i];
            }
        }
        return ans;
    }
}