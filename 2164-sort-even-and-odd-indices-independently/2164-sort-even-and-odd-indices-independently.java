class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int evenIndex=0, oddIndex=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=even.get(evenIndex++);
            }
            else{
                nums[i]=odd.get(oddIndex++);
            }

        }
        return nums;
    }
}