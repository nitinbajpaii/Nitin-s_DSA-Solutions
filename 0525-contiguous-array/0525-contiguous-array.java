class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                arr[i] = -1;
            } else {
                arr[i] = 1;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                int length = i-map.get(sum);
                max = Math.max(max,length);
            }
            else{
                map.put(sum,i);
            }
        }
        return max;

    }
}