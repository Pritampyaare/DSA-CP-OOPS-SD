class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int repeated=-1, missing=-1;
        for(int e: nums){
            if(visited[e-1]) repeated=e;
            visited[e-1]=true;
        }
        for(int i=0; i<nums.length; i++){
            if(visited[i]==false){
                missing=i+1; break;
            }
        }
        return new int[]{repeated, missing};
    }
}