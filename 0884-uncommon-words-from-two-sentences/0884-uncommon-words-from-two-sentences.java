class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words = s1.split("\\s+");
        String[] words1 = s2.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(String w: words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        for(String x:words1){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<String> ans = new ArrayList<>();
        for(String key: map.keySet()){
            if(map.get(key)==1){
                ans.add(key);
            }
        }
        return ans.toArray(new String[0]);
    }
}