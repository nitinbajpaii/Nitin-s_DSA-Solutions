class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(i%2!=0){
                arr[i] = (char) (arr[i-1] + (arr[i] -'0'));
            }
        }
        return new String(arr);
    }
}