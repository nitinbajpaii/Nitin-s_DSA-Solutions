class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count1=0;
        
        for(int i=left;i<=right;i++){
            int nums =i;
            int count=0;
            
            while(nums>0){
                nums = nums & nums-1;
                count++;
            }
                if(isPrimeOrNot(count)){
                    count1++;
                }
        }
        return count1;
    }
    public boolean isPrimeOrNot(int n){
        if(n<2){
            return false;
        }
        boolean isPrime = true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}