class Solution {
    public int minSwaps(String s) {
        int open=0;
        int close =0;
        for(char ch: s.toCharArray()){
            if(ch=='['){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else{
                    close++;
                }
            }

        }
        return (open+1)/2;
    }
}