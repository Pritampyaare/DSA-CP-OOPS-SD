class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        for(int i=nums.length-1; i>=0; i--) stk.push(nums[i]);
        int[] arr = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            while(!stk.isEmpty() && stk.peek()<=nums[i]) stk.pop();
            arr[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(nums[i]);
        }
        return arr;
    }
}