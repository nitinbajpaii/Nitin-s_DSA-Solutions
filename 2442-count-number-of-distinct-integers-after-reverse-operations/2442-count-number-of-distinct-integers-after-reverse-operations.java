class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[n+i]= rev(nums[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int x:ans){
            set.add(x);
        }
        return set.size();
    }
    public int rev(int n){
        int rev=0;
        while(n!=0){
            int digit = n%10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
}