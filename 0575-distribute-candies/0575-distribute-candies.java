class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        for(int x: candyType){
            set.add(x);
        }
        return Math.min(set.size(),n/2);
    }
}