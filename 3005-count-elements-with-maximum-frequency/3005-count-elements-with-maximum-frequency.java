class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int maxFreq=0;
        for(int n: map.keySet()){
            if(map.get(n)>maxFreq){
                maxFreq= map.get(n);
            }
        }
        int count=0;
        for(int n: nums){
            if(map.get(n)==maxFreq){
                count+=1;
            }
        }
        return count;
    }
}