class Solution {
    public int findComplement(int n) {
        //Method -1
        // String rev ="";
        // while(n>0){
        //     if(n%2==1){
        //         rev += '1';
        //     }
        //     else{
        //         rev += '0';
        //     }
        //     n /= 2;
        // }
        // String binary = new StringBuilder(rev).reverse().toString();
        // String ans ="";
        // for(int i=0;i<binary.length();i++){
        //     if(binary.charAt(i)=='1'){
        //         ans +='0';
        //     }
        //     else{
        //         ans += '1';
        //     }
        // }
        // return Integer.parseInt(ans,2);

        //Method -2
        int mask =1;
        while(mask<n){
            mask = mask<<1|1;
        }
        return mask^n;
    }
}