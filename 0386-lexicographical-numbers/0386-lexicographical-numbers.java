class Solution {
    public void recurs(int n, int idx, List<Integer> ans){
        if(idx > n) return;
        ans.add(idx);

        for(int i = 0; i <= 9; i++){
            recurs(n, idx * 10 + i, ans);
        }

    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i <= 9; i++){
            recurs(n, i, ans);
        }
        return ans;
    }
}