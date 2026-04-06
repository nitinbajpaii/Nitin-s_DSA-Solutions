class Solution {
    public int firstUniqueEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: nums){
           map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x:nums){
            if(x%2==0 && map.get(x)==1){
                return x;
            }
        }
        return -1;
    }
}