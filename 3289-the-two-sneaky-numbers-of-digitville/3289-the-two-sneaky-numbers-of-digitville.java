class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int key: map.keySet()){
            if(map.get(key)==2){
                list.add(key);
            }
        }
        int[] arr = new int[list.size()];
        arr[0]= list.get(0);
        arr[1]= list.get(1);
        return arr;
    }
}