class Solution {
    public int[] sumZero(int n) {
        if(n==1){
            return new int[] {0};
        }
        int[] res = new int[n];
        res[0] = n * (1-n)/2;
        for(int i=1;i<n;i++){
            res[i]=i;
        }
        return res;
    }
}