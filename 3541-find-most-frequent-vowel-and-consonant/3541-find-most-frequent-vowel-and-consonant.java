class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowel = new HashMap<>();
        HashMap<Character,Integer> consonant = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel.put(ch,vowel.getOrDefault(ch,0)+1);
            }
            else{
                consonant.put(ch,consonant.getOrDefault(ch,0)+1);
            }
        }
        int max1 = 0;
        for(char x: vowel.keySet()){
            if(vowel.get(x)>max1){
                max1=vowel.get(x);
            }
        }
        int max2 =0;
        for(char x: consonant.keySet()){
            if(consonant.get(x)>max2){
                max2=consonant.get(x);
            }
        }
        return max1+max2;
        
    }
}