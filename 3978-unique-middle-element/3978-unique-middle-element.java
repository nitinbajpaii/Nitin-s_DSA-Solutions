class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums[nums.length/2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        if(map.get(n)==1){
            return true;
        }
        return false;
    }
}