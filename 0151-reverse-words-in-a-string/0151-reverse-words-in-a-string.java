class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int n = words.length;
        StringBuilder sb = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}