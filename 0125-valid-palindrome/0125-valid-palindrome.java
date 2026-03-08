class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch>='a'&&ch<='z'){
                sb.append(ch);
            }
            if(ch>='0'&&ch<='9'){
                sb.append(ch);
            }
        }
        String str = sb.toString();
        String rev = sb.reverse().toString();
        return str.equals(rev);

    }
}