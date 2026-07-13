class Solution {
    public String reversePrefix(String word, char ch) {
        int index = firstOccurence(word, ch);

        if (index == -1) {
            return word;
        }
        char[] arr = word.toCharArray();
        int start = 0;
        int end = index;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }

    public int firstOccurence(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }
}