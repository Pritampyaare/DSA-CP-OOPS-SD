class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        if(n==1) return new ArrayList<Integer>(Arrays.asList(nums[0]));
        List<Integer> res = new ArrayList<>();
        int first = 0, second = 1, firstCount = 0, secondCount = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == first) firstCount++;
            else if(nums[i] == second) secondCount++;
            else if(firstCount == 0){
                first = nums[i];
                firstCount = 1;
            }else if(secondCount == 0){
                second = nums[i];
                secondCount = 1;
            }else{
                firstCount--;
                secondCount--;
            }
        }
        firstCount=0; secondCount=0;
        for(int i=0; i<n; i++){
            if(nums[i] == first){
                firstCount++;
            }
            else if(nums[i] == second){
                secondCount++;
            }
        }
        if(firstCount > n/3) res.add(first);
        if(secondCount > n/3) res.add(second);
        return res;
    }
}