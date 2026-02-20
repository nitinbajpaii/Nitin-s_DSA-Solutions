class Solution {
    public int maxDepth(String s) {
        int maxLen=0;
        int count=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                count++;

                if(count>maxLen){
                    maxLen=count;
                }
            }
            else if (ch==')'){
                count--;
            }
        }
        return maxLen;
    }
}