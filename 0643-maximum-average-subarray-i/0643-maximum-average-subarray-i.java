class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int currSum=0,finalSum = Integer.MIN_VALUE;
        int i=0,j=0;
        double avg_sum=0;
        while(j<n){
            currSum += nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(currSum > finalSum){
                    finalSum = currSum;
                    avg_sum = (double) finalSum/k;
                }
                currSum -= nums[i];
                i++;
                j++;
            }
        }
        return avg_sum;

    }
}