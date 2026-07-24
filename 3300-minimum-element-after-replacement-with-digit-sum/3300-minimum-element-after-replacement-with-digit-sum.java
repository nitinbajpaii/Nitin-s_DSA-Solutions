class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int n : nums) {
            arr.add(sum(n));
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<min){
                min = arr.get(i);
            }
        }
        return min;
    }

    public int sum(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}