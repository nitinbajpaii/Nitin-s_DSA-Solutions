class Solution {
    public boolean isPalindromic(String s) {
        String binary ="";
        for(int i=0;i<s.length();i++){
            String temp = Integer.toBinaryString(s.charAt(i));
            while(temp.length()<8){
                temp = '0'+temp;
            }
            binary += temp;
        }
        return isPalindrome(binary);
    }
    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}