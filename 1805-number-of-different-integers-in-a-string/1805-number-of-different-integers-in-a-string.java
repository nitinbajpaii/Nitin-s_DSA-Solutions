class Solution {
    public int numDifferentIntegers(String word) {
        String[] arr = word.replaceAll("[a-z]"," ").split("\\s+");
        HashSet<String> set = new HashSet<>();
        for(String s : arr){
            if(s.length()==0) continue;
            s = s.replaceFirst("^0+","");
            if(s.equals("")) s="0";

            set.add(s);
        }
        return set.size();
    }
}