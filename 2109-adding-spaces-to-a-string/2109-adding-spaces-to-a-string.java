class Solution {
    public String addSpaces(String s, int[] spaces) {
        HashSet<Integer> set = new HashSet<>();
        for(int x: spaces){
            set.add(x);
        }
        StringBuilder sb = new StringBuilder();
        if(set.contains(0)){
            sb.append(" ");
        }
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            if(set.contains(i+1)){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}