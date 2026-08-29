class Solution {
    public String[] largestString(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String ans = "";
            int num = nums[i];

            while (num > 0) {
                int power = 1;
                int index = 0;

                while (index < 25 && power * 2 <= num) {
                    power *= 2;
                    index++;
                }

                char ch = (char) ('a' + index);
                ans += ch;
                num -= power;
            }

            arr[i] = ans;
        }

        return arr;
    }
}