class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int n = words.length;
        int count=0;
        for(int i=left;i<=right;i++){
            char[] ch = words[i].toCharArray();
            if(isVowel(ch[0]) && isVowel(ch[ch.length-1])){
                count++;
            }
        }
        return count;
        
    }
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}