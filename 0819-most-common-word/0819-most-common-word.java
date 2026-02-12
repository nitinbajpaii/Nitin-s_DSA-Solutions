class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] words = paragraph.split("\\s+");
        HashSet<String> bannedSet = new HashSet<>();
        for(String b: banned){
            bannedSet.add(b);
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(String word : words){
            if(word.length()>0 && !bannedSet.contains(word))
            map.put(word,map.getOrDefault(word,0)+1);
        }
        String res ="";
        int max=0;
        for(String word : map.keySet()){
            if(map.get(word)>max){
                max = map.get(word);
                res=word;
            }
        }
        return res;
    }
}