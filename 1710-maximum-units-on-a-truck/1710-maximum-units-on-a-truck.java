class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> b[1] - a[1]);
        int totalUnits = 0;
        for(int[] box: boxTypes){
            int numberOfBoxes = box[0];
            int numberOfUnitsPerBox = box[1];
            int toTakeBoxes = Math.min(numberOfBoxes,truckSize);

            totalUnits += toTakeBoxes*numberOfUnitsPerBox;
            truckSize -= toTakeBoxes;

            if(truckSize==0){
                break;
            }
        }
        return totalUnits;
    }
}