class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] remStudents = new int[2];
        for(int s: students) remStudents[s]++;
        for(int s : sandwiches){
            if(remStudents[s] > 0){
                remStudents[s]--;
            }else{
                return remStudents[0]+remStudents[1];
            }
        }
        return 0;
    }
}