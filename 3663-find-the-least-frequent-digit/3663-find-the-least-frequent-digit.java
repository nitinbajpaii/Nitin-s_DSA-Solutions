class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n>0){
            int digit = n%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            n /= 10;
        }
        int min_freq = Integer.MAX_VALUE;
        int ans=0;
        for(int digit: map.keySet()){
            int freq = map.get(digit);
            if(map.get(digit)<min_freq){
                min_freq = map.get(digit);
                ans = digit;
            }
            else if(min_freq == freq && digit<ans){
                ans = digit;
            }
        }
        return ans;
    }
}