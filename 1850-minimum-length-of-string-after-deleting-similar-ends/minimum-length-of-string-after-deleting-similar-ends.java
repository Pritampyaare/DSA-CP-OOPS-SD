class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int left = 0; int right = n-1;
        if(s.charAt(left) != s.charAt(right))
            return n;
        char current = s.charAt(left);
        while(left < right)
        {

            while(left < n && s.charAt(left) == current)
                    left++;

            while(right >= 0 && s.charAt(right) == current)
                    right--;

            if(left >= n || right < 0)
                return 0;

            if(s.charAt(left) != s.charAt(right))
                return right - left + 1;
            
            current = s.charAt(left);
        }

        int len = right - left + 1;
        return len < 0 ? 0 : len;
    }
}