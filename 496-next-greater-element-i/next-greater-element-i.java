class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stk = new Stack<>();
        stk.push(nums2[nums2.length-1]);
        map.put(nums2[nums2.length-1], -1);

        for(int i=nums2.length-2; i>=0; i--){
            if(stk.size()==0){
                stk.push(nums2[i]);
                map.put(nums2[i], -1);
                continue;
            }
            if(nums2[i]<stk.peek()){
                map.put(nums2[i], stk.peek());
                stk.push(nums2[i]);
            }else{
                while(!stk.isEmpty() && stk.peek()<nums2[i]) stk.pop();
                if(stk.isEmpty()){
                    stk.push(nums2[i]);
                    map.put(nums2[i], -1);
                }else{
                    map.put(nums2[i], stk.peek());
                    stk.push(nums2[i]);
                }
            }
        }
        int[] res = new int[nums1.length];
        for(int i=0; i<nums1.length; i++) res[i] = map.get(nums1[i]);
        return res;
    }
}