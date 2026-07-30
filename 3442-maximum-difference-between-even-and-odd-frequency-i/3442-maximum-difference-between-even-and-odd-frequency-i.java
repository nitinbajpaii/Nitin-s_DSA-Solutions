class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int freq : map.values()){
            if(freq%2==0){
                minEven = Math.min(freq,minEven);
            }
            else{
                maxOdd = Math.max(freq,maxOdd);
            }
        }
        return maxOdd - minEven;
    }
}