class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int n:nums){
            while(n>0){
                int d = n % 10;
                arr.add(d);
                n /= 10;
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return map.getOrDefault(digit,0);
    }
}