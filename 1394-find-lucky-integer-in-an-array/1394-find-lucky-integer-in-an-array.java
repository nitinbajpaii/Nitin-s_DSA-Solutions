class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int maxLucky=-1;
        for(int x:map.keySet()){
            if(x==map.get(x)){
                maxLucky = Math.max(maxLucky,x);
            }
        }
        return maxLucky;
    }
}