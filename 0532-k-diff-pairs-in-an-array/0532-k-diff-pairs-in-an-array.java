class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> pair = new HashSet<>();
        for(int n: nums){
            if(seen.contains(n-k)){
                pair.add(n-k);
            }
            if(seen.contains(n+k)){
                pair.add(n);
            }
            seen.add(n);
        }
        return pair.size();
    }
}