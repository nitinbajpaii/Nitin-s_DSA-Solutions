class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        int[] count = new int[128];
        for(char ch: s.toCharArray()){
            count[ch]++;
        }
        int res =0;
        for(int i=0;i<128;i++){
            int val = count[i];
            res += (val/2) * 2;
            if(res%2==0 && val%2==1){
                res++;
            }
        }
        return res;
    }
}