class Solution {
    public long sumAndMultiply(int n) {
        int original = n;
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            int digit = n % 10;
            if(digit!=0){
                sb.append(digit);
            }
            n /= 10;
        }
        if(sb.length()==0){
            return 0;
        }
        String str = sb.reverse().toString();
        long ans = Integer.parseInt(str);
        return ans * sumOfDigits(original);
        
    }
    public int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}