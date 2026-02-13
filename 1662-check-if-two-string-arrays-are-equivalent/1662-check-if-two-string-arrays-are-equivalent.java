class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n = word1.length;
        int m = word2.length;
        String str1="";
        String str2="";
        for(int i=0;i<n;i++){
            str1 += word1[i];
        }
        for(int i=0;i<m;i++){
            str2 += word2[i];
        }
        return str1.equals(str2);
    }
}