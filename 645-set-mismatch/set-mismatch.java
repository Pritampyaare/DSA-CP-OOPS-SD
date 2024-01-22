class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int repeated = -1, missing=-1;
        for(int e: nums){
            if(set.contains(e)) repeated=e;
            set.add(e);
        }
        for(int i=1; i<=nums.length; i++) if(!set.contains(i)) missing=i;
        return new int[]{repeated, missing};

    }
}