class Solution {
    public int countBeautifulPairs(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int first = firstDigit(nums[i]);
            for(int j=i+1;j<n;j++){
                int last = nums[j]%10;

                if(gcd(first,last)==1){
                    count++;
                }
            }
        }
        return count;
    }
    public int firstDigit(int n){
        while(n>=10){
            n /= 10;
        }
        return n;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else return gcd(b,a%b);
    }
}