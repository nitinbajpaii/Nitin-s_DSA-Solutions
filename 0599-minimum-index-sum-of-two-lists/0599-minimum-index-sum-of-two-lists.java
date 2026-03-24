class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int minSum = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                int i = map.get(list2[j]);
                int sum = i+j;

                if(sum<minSum){
                    minSum = sum;
                    res.clear();
                    res.add(list2[j]);
                }
                else if (sum==minSum){
                    res.add(list2[j]);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}