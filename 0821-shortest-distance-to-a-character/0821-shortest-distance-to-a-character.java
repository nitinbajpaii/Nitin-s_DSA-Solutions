class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = closestOccurence(s,i,c);
        }
        return ans;
    }
    public int closestOccurence(String s ,int index, char c){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                int distance = Math.abs(index-i);
                min = Math.min(distance,min);
            }
        }
        return min;
    }
}