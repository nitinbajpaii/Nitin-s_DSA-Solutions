class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String curr = word;
        while(sequence.contains(curr)){
            count++;
            curr += word;
        }
        return count;
    }
}