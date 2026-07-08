class Solution {
    public int[] evenOddBit(int n) {
        int[] arr = new int[2];
        String rev ="";
        while(n>0){
            if(n%2==1){
                rev += '1';
            }
            else{
                rev += '0';
            }
            n /= 2;
        }
        int even=0, odd=0;
        for(int i=0;i<rev.length();i++){
            if(rev.charAt(i)=='1'){
                if(i%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        arr[0]=even;
        arr[1]=odd;
        return arr;
    }
}