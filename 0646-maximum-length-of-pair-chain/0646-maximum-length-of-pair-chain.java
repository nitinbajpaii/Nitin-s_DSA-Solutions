class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int count=0;
        int end = Integer.MIN_VALUE;
        for(int[] pair:pairs){
            if(pair[0]>end){
                count++;
                end = pair[1];
            }
        }
        return count;
    }
}