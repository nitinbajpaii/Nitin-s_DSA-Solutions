class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            set2.add(n);
        }
        int count1=0;
        int count2=0;
        for(int n:nums1){
            if(set2.contains(n)){
                count1++;
            }
        }
        for(int n:nums2){
            if(set1.contains(n)){
                count2++;
            }
        }
        return new int[]{count1,count2};
        
    }
}