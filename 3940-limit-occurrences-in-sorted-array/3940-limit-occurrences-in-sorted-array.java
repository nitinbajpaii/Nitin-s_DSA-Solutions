class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int n: map.keySet()){
            int freq = map.get(n);
            if(freq>=k){
                for(int i=0;i<k;i++){
                    arr.add(n);
                }
            }
            else{
                for(int i=0;i<freq;i++){
                    arr.add(n);
                }
            }
        }
        Collections.sort(arr);
        int[] ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}