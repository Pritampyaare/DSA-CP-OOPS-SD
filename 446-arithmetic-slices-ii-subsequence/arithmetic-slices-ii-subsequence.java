class Solution {
    int count=0;
    public int numberOfArithmeticSlices(int[] A) {
    int res = 0;
    Map<Integer, Integer>[] map = new Map[A.length];
		
    for (int i = 0; i < A.length; i++) {
        map[i] = new HashMap<>(i);
        	
        for (int j = 0; j < i; j++) {
            long diff = (long)A[i] - A[j];
            if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE) continue;
        		
            int d = (int)diff;
            int c1 = map[i].getOrDefault(d, 0);
            int c2 = map[j].getOrDefault(d, 0);
            res += c2;
            map[i].put(d, c1 + c2 + 1);
        }
    }
		
    return res;
}
    
}
// class Solution {
//     int count=0;
//     public int numberOfArithmeticSlices(int[] nums) {
//         helper(nums, 0, new ArrayList<>());
//         return count;
//     }
//     public void helper(int[] nums, int idx, ArrayList<Integer> al){
//         int size = al.size();
//         if(idx==nums.length){
//             if(al.size()>=3) count++;
//             return;
//         }
//         if(size<2 || (long)nums[idx]-(long)al.get(size-1)==(long)al.get(al.size()-1)-(long)al.get(al.size()-2)){
//             ArrayList<Integer> temp = new ArrayList<>();
//             temp.addAll(al); temp.add(nums[idx]);
//             helper(nums, idx+1, temp);
//         }
//         helper(nums, idx+1, al);
//     }
// }