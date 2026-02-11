class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int n : nums1) {
            set.add(n);
        }

        for (int x : nums2) {
            if (set.contains(x)) {
                result.add(x);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for (int n : result) {
            ans[i++] = n;
        }
        return ans;
    }
}