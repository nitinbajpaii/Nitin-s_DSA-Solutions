class Solution {
    public int averageValue(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0 && n % 3 == 0) {
                ans.add(n);
            }
        }

        int sum = 0;
        int size = ans.size();

        for (int x : ans) {
            sum += x;
        }

        if (size == 0) {
            return 0;
        }

        return sum / size;
    }
}