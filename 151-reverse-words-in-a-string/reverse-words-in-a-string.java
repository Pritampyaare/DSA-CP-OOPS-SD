class Solution {
    public static char[] reverse(char arr[], int start, int end){
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        return arr;
    }
    public String reverseWords(String s) {
        char[] str = reverse(s.toCharArray(),0,s.length()-1);
        int start = 0, end= 0;
        for(int i=0; i<str.length; i++){
            if(str[i] != ' '){
                str[end] = str[i];
                end++;
            }else if(i>0 && str[i-1] != ' '){
                reverse(str, start, end-1);
                str[end] = ' ';
                end++;
                start = end;
            }
        }
        reverse(str,start,end-1);
        return new String(str,0, end>0 && str[end-1] == ' ' ? end-1 : end);
    }
}