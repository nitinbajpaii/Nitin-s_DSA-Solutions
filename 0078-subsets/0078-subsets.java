class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(nums,0,res,curr);
        return res;
    }
    void solve(int[] nums,int index,List<List<Integer>> res,List<Integer> curr){
        if(index==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        //exclude
         solve(nums,index+1,res,curr);

        //include

        curr.add(nums[index]);
        solve(nums,index+1,res,curr);
        curr.remove(curr.size()-1);

    }
}