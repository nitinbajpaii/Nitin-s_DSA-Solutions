class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int x: map.keySet()){
            if(map.get(x)==1){
                arr.add(x);
            }
        }
        int[] ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]= arr.get(i);
        }
        return ans;
    }
}