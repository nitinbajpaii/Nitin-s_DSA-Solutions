class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse1 = reverse(num);
        int reverse2 = reverse(reverse1);
        return reverse2==num;

    }
    public int reverse(int n){
        int rev = 0;
        while(n!=0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
}