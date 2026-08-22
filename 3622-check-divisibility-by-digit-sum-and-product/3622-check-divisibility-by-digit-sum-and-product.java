class Solution {
    public boolean checkDivisibility(int n) {
        int sum = sumOfDigits(n);
        int product = productOfDigits(n);
        return n % (sum+product)==0;
    }
    public int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            int digit = n%10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
    public int productOfDigits(int n){
        int product=1;
        while(n!=0){
            int digit = n%10;
            product *= digit;
            n /= 10;
        }
        return product;
    }
}