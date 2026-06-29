class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        int size = arr.size();
        Collections.rotate(arr,k);
        for(int i=0;i<size;i++){
            nums[i]=arr.get(i);
        }
    }
}