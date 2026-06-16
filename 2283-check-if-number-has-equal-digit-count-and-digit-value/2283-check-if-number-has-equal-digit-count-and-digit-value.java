class Solution {
    public boolean digitCount(String num) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : num.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int n = num.length();
        for (int i = 0; i < n; i++) {
            if ((num.charAt(i) - '0') != map.getOrDefault((char) (i + '0'), 0)) {
                return false;
            }
        }
        return true;
    }
}