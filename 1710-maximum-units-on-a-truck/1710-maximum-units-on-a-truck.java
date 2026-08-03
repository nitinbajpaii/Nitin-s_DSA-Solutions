class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> b[1] - a[1]);
        int ans =0;
        for(int i=0;i<boxTypes.length;i++){
            int boxes = Math.min(boxTypes[i][0],truckSize);
            ans += boxTypes[i][1]*boxes;
            truckSize -= boxes;

            if(truckSize==0){
                break;
            }
        }
        return ans;
    }
}