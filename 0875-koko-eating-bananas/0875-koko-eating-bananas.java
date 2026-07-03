class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high = findMax(piles);
        while(low<=high){
            int mid = low+(high-low)/2;
            int totalH = totalHours(piles,mid);
            if(totalH<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int findMax(int[] piles){
        int max = Integer.MIN_VALUE;
        int n = piles.length;
        for(int i=0;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        return max;
    }
    public int totalHours(int[] piles,int hourly){
        int totalH=0;
        int n = piles.length;
        for(int i=0;i<n;i++){
            totalH += Math.ceil((double)piles[i]/(double)hourly);
        }
        return totalH;
    }

}