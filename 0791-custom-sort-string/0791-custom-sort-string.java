class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),0);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
        }
        for(char ch: map.keySet()){
            int count = map.get(ch);
            while(count-->0){
                sb.append(ch);
            }
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}