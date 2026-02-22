class Solution {
    public char slowestKey(int[] arr, String s) {
        int n = arr.length;
        int diff =0;
        int max = arr[0];
        char ch = s.charAt(0);
        for(int i=1;i<n;i++){
            diff = arr[i]-arr[i-1];

            if(diff>max || diff==max && s.charAt(i)>ch){
                max=diff;
                ch = s.charAt(i);
            }
        } 
        return ch;
    }
}