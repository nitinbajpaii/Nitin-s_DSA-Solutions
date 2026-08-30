class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 1;
        }
        int maxIndex =-1;
        int minIndex=-1;
        int max=Integer.MIN_VALUE;;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]<min){
                min = nums[i];
                minIndex=i;
            }
        }
        int left = Math.max(maxIndex,minIndex)+1;
        int right = n - Math.min(minIndex,maxIndex);
        int bothSides = Math.min(maxIndex,minIndex)+1 + n-Math.max(maxIndex,minIndex);

        return Math.min(left,Math.min(right,bothSides));
    }
}