class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (nums[i] == nums[j] && nums[j] == nums[k]) {
                        int abs = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                        min = Math.min(abs, min);
                    }
                }
            }
        }
        return min==Integer.MAX_VALUE? -1:min;
    }
}