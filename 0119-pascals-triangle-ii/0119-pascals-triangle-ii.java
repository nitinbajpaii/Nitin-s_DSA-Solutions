class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    list.add(1);
                }
                else{
                    list.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
            res.add(list);
        }
        return res.get(rowIndex); 
    }
}