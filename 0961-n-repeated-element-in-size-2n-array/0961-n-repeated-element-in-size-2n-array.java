class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        int n = len/2;
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x: map.keySet()){
            if(map.get(x)==n){
                return x;
            }
        }
        return -1;
    }
}