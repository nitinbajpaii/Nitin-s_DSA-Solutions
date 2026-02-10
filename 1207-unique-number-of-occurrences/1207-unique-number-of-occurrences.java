class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int count:map.values()){
            if(set.contains(count)){
                return false;
            }
            set.add(count);
        }
        return true;

    }
}