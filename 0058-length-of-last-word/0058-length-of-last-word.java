class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        int n = words.length;
        return words[n-1].length();
    }
}