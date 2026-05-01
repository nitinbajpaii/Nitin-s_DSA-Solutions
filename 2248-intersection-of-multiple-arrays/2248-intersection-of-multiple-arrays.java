class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=0;j<nums[i].length;j++){
                set.add(nums[i][j]);
            }
            for(int num:set){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        for(int x: map.keySet()){
            if(map.get(x)==n){
                list.add(x);
            }
        }
        Collections.sort(list);
        return list;
    }
}