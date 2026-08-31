class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)-> map.get(b)-map.get(a));
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}