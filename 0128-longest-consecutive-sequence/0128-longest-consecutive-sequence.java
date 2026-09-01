class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int max=0;
        for(int ele : set){
            if(!set.contains(ele-1)){
                int len=1;
                while(set.contains(ele+len)){
                    len++;
                }
                max = Math.max(max,len);
            }
        }
        return max;
    }
}