class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            N = -N;
            x = 1/x;
        }
        return solve(x,N);
    }

    static double solve(double x, long n){
        if (n==0){
            return 1;
        }
        double half = solve(x,n/2);
        if(n%2==0){
            return half*half;
        }
        else{
            return x*half*half;
        }
    }
}