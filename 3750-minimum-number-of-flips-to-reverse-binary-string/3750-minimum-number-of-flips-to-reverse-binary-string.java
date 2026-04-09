class Solution {
    public int minimumFlips(int n) {
        String binary = Integer.toBinaryString(n);
        String reversed = new StringBuilder(binary).reverse().toString();

        int a = Integer.parseInt(binary, 2);
        int b = Integer.parseInt(reversed, 2);

        return countSetbit(a ^ b);
    }

    public int countSetbit(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}