class Solution {
    public String arrangeWords(String text) {
        text=text.toLowerCase();
        String[] words = text.trim().split("\\s+");
        Arrays.sort(words,(a,b)-> a.length()-b.length());
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            sb.append(word).append(" ");
        }
        String ans = sb.toString().trim();
        ans = Character.toUpperCase(ans.charAt(0))+ans.substring(1);
        return ans;
    }
}