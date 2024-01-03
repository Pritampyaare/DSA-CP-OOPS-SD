class Solution {
    int m = 1000000007;
    public int countGoodNumbers(long n) {
        
        long ans = pow(20, n/2);
        if(n%2==1) ans = (ans%m*5)%m;
        return (int)ans%m;
    }
    public long pow(int x, long n){
        if(n==0) return 1;
        long temp = pow(x, n/2);
        if(n%2==0) return (temp%m*temp%m)%m;
        else return (((temp%m*temp%m)%m)*x)%m;
    }
}