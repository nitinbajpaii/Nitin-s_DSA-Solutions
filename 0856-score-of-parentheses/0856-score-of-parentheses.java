class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                open--;

                if (s.charAt(i - 1) == '(') {
                    score += 1 << open;
                }
            }
        }

        return score;
    }
}