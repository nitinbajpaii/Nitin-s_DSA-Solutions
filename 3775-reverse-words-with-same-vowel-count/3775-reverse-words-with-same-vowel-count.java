class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.trim().split("\\s+");
        int count = vowelCount(str[0]);
        sb.append(str[0]);
        for (int i = 1; i < str.length; i++) {
            sb.append(" ");
            if (vowelCount(str[i]) == count) {
                sb.append(new StringBuilder(str[i]).reverse());
            } else {
                sb.append(str[i]);
            }
        }
        return sb.toString();
    }

    public int vowelCount(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}