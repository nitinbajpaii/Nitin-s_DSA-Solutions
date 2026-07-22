class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(char ch: t.toCharArray()){
            if(map.getOrDefault(ch,0)>0){
                map.put(ch,map.get(ch)-1);
            }
            else{
                count++;
            }

        }
        return count;
    }
}