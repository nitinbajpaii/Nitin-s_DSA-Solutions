class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int pro=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                pro = (nums[i]-1)*(nums[j]-1);

                if(pro>max){
                    max = Math.max(max,pro);
                }
            }
        }
        return max;
    }
}