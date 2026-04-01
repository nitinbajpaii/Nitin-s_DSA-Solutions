class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int res=0;

        for(int key: map.keySet()){
            if(map.get(key)==2){
                arr.add(key);
                res ^= key;
            }
        }
        return res;
    }
}