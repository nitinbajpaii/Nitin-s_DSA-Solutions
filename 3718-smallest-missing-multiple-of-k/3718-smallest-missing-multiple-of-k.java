class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int x: nums){
            set.add(x);
        }
        int n = nums.length;
        for(int i=1; ;i++){
            int pro=1;
            pro = i*k;
            if(!set.contains(pro)){
                return pro;
            }
        }
    }
}