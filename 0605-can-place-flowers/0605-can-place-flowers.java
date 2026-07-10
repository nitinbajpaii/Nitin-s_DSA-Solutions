class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int a) {
        int n = flowerbed.length;
        for(int i=0;i<n;i++){
           if(flowerbed[i]==0){
            if((i==0||flowerbed[i-1]==0) && (i==n-1 ||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                a--;
            }
           }
        }
        return a<=0;
    }
}