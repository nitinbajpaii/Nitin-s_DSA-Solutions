class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        double sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int j: salary){
            if(j>max){
                max=j;
            }
            if(j<min){
                min=j;
            }
        }
        for(int i: salary){
            sum += i;
        }
        return (sum-max-min)/(n-2);
    }
}