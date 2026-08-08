class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] arr = new int[n+1];
        int low =0;
        int high = n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                arr[i] = low++;
            }
            else{
                arr[i] = high--;
            }
        }
        arr[n]=low;
        return arr;
    }
}