class Solution {
    public int smallestAbsent(int[] nums) {
        int sum=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int avg = sum / n;
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int candidate = Math.max(avg + 1, 1);
        int i=0;
        while(true){
            if(!set.contains(candidate)){
                return candidate;
            }
            candidate++;
        }
    }
}