class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(arr[i]);

            if(i!=k-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}