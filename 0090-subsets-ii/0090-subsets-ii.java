class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(nums,0,curr,res);
        return res;
    }
    public void solve(int[] nums,int index,List<Integer> curr,List<List<Integer>> res){
        if(index==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        //include
        curr.add(nums[index]);
        solve(nums,index+1,curr,res);
        curr.remove(curr.size()-1);

        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }

        //exclude 
        solve(nums,index+1,curr,res);
    }
}