class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(nums,0,curr,res);
        return res;
    }
    void solve(int[] nums,int index,List<Integer> curr,List<List<Integer>> res){
        if(index==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        //exclude 
        solve(nums,index+1,curr,res);

        //include
        curr.add(nums[index]);
        solve(nums,index+1,curr,res);
        curr.remove(curr.size()-1);
    }
}