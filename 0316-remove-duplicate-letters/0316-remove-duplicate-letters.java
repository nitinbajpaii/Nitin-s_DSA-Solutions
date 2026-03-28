class Solution {
    public String removeDuplicateLetters(String s) {

        int[] freq = new int[26];
        boolean[] seen = new boolean[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            freq[c - 'a']--;
            if (seen[c - 'a']) continue;
            while (sb.length() > 0 &&
                   c < sb.charAt(sb.length() - 1) &&
                   freq[sb.charAt(sb.length() - 1) - 'a'] > 0) {

                seen[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

            sb.append(c);
            seen[c - 'a'] = true;
        }

        return sb.toString();
    }
}
