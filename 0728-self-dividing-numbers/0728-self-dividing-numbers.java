class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num =i;
            boolean flag = true;
            while(num>0){
                int digit = num % 10;
                if(digit==0|| i%digit!=0){
                    flag = false;
                }
                num /= 10;
            }
            if(flag){
                ans.add(i);
            }

        }
        return ans;
    }
}