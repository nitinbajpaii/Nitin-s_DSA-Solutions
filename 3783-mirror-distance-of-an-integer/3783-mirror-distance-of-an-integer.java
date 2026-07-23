class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-rev(n));
    }
    public int rev(int n){
        int rev=0;
        while(n!=0){
            int digit = n % 10;
            rev = rev*10 + digit;
            n /= 10;
        }
        return rev;
    }
}