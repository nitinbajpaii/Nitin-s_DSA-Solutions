class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int res = 0;
        for (int ele : set) {
            if (!set.contains(ele - 1)) {
                int len = 1;
                while (set.contains(ele + len)) {
                    len++;
                }
                res = Math.max(res, len);
            }
        }
        return res;
    }
}