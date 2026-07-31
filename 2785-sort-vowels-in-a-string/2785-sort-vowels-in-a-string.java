class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> vowels = new ArrayList<>();
        for(char ch: s.toCharArray()){
            if(isVowel(ch)){
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);
        int idx=0;
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                sb.append(vowels.get(idx++));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();

    }
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}