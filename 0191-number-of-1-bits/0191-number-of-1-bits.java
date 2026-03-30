class Solution {
    public int hammingWeight(int n) {
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
         
        int count=0;
        int x = rev.length();
        for(int i=0;i<x;i++){
            if(rev.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}