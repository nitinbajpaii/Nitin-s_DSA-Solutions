class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max =0;
        for(int i= lowLimit;i<=highLimit;i++){
            int num=i;
            int sum=0;
            while(num>0){
                int digit = num %10;
                sum += digit;
                num /= 10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

            max = Math.max(max,map.get(sum));

        }
        return max;


    }
}