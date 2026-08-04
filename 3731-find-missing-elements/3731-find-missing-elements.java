class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int n:nums){
            set1.add(n);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n:nums){
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=min;i<=max;i++){
            set2.add(i);
        }
        for(int n:set2){
            if(!set1.contains(n)){
                ans.add(n);
            } 
        }
        Collections.sort(ans);
        return ans;
    }
}