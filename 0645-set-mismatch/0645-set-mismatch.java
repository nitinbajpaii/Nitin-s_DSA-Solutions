class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int duplicate=0;
        for(int x:map.keySet()){
            if(map.get(x)==2){
                duplicate=x;
                arr.add(x);
                break;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int totalSum = n*(n+1)/2;
        int missing = totalSum-(sum-duplicate);
        arr.add(missing);

        int[] ans = new int[2];
        ans[0]=arr.get(0);
        ans[1]=arr.get(1);
        
        return ans;
    }
}