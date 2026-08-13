class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        String[] ans = new String[n];
        Arrays.sort(heights);
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j++] = map.get(heights[i]);
        }
        return ans;
    }
}