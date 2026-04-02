class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int index = i;
            int count = 0;
            while (index > 0) {
                index = index & (index - 1);
                count++;
            }
            if (count == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}