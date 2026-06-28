class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder sb = new StringBuilder();
        while(!map.isEmpty()){
            char maxChar = ' ';
            int maxFreq = 0;
            for(char ch : map.keySet()){
                if(map.get(ch)>maxFreq){
                    maxFreq = map.get(ch);
                    maxChar = ch;
                }
            }
            while(maxFreq-->0){
                sb.append(maxChar);
            }
            map.remove(maxChar);
        }
        return sb.toString();
    }
}