class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int n: nums1){
            set1.add(n);
        }
        
        for(int n: nums2){
            set2.add(n);
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int n: set1){
            if(!set2.contains(n)){
                list1.add(n);
            }
        }
        for(int n: set2){
            if(!set1.contains(n)){
                list2.add(n);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;
    }
}