class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x%sumOfDigits(x)==0){
            return sumOfDigits(x);
        }
        else{
            return -1;
        }
        
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
}