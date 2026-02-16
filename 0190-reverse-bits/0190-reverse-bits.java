public class Solution {
    public int reverseBits(int n) {
        long ans = 0;

        for (int i = 0; i < 32; i++) {
            int rem = n & 1;        // n % 2
            ans = ans * 2 + rem;    // binary build kar rahe ho but reverse order me
            n >>>= 1;               // n = n / 2 (but unsigned shift)
        }

        return (int) ans;
    }
}