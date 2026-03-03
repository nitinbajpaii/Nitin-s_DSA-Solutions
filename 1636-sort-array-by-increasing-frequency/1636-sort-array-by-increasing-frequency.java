class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->{
            if(map.get(a).equals(map.get(b))){
                return b-a;
            }
            return map.get(a)-map.get(b);

        });
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
        }
        return ans;


    }
}