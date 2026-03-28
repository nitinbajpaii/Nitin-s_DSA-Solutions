class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int left=0;
        int right=n-1;
        while(left<right){

            while(left<right && !isVowel(arr[left])){
                left++;
            }

            while(left<right && !isVowel(arr[right])){
                right--;
            }

            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
          
    }
    private boolean isVowel(char c){
            c= Character.toLowerCase(c);
            return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
        }
}