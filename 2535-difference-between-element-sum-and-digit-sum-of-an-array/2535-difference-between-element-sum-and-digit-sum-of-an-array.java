class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int x: nums){
            sum += x;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int x:nums){
            while(x!=0){
                list.add(x%10);
                x /= 10;
            }
        }
        int digit_sum=0;
        for(int i=0;i<list.size();i++){
            digit_sum += list.get(i);
        }
        return Math.abs(sum-digit_sum);
    }
}