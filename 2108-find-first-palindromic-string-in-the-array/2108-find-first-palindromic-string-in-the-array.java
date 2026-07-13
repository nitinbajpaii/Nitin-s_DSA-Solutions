class Solution {
    public String firstPalindrome(String[] words) {
        String res ="";
        for(String word: words){
            if(isPallindrome(word)){
                res += word;
                break;
            }
        }
        return res;  
    }
    public boolean isPallindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        return s.equals(rev);
    }
}