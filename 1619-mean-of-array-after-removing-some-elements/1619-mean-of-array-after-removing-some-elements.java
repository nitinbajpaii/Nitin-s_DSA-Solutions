class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int removed = n/20;
        double sum=0;
        for(int i=removed;i<n-removed;i++){
            sum += arr[i];
        } 
        return sum/(n-2*removed); 
    }
}