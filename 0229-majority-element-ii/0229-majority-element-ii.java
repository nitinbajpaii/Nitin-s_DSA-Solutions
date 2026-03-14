class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int x: map.keySet()){
            if(map.get(x)>n/3){
                arr.add(x);
            }
        }
        return arr;
    }
}