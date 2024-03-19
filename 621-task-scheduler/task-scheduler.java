class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n==0) return tasks.length;
        int max = 0;
        int[] freq = new int[26];
        for(char task: tasks){
            freq[task-'A']++;
            max = Math.max(max, freq[task-'A']);
        }
        int ans = (max-1)*(n+1);
        for(int i=0; i<26; i++) if(freq[i] == max) ans++;
        return Math.max(ans, tasks.length);
    }
}