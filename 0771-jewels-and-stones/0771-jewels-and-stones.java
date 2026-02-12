class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> res = new HashSet<>();

        for(char ch: jewels.toCharArray()){
            set1.add(ch);
        }
        int count=0;
        for(char x: stones.toCharArray()){
            if(set1.contains(x)){
                res.add(x);
                count++;
            }
        }
        return count;
    }
}