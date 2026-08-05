class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum1=0;
        for(int n:gas){
            sum1 += n;
        }
        int sum2=0;
        for(int n:cost){
            sum2 += n;
        }
        if(sum1<sum2){
            return -1;
        }
        int n = gas.length;
        int tank=0;
        int index=0;

        for(int i=0;i<n;i++){
            tank += gas[i]-cost[i];
            if(tank<0){
                index=i+1;
                tank=0;
            }
        }
        return index;
    }
}