class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums1){
            set.add(n);
        }
        int min = Integer.MAX_VALUE;
        for(int x : nums2){
            if(set.contains(x)){
                if(x<min){
                    min =x;
                }
            }
        }
        return min==Integer.MAX_VALUE ? -1: min;
    }
}