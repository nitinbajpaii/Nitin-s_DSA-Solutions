class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!isAna(words[i],words[i-1])){
                ans.add(words[i]);
            }
        }
        return ans; 
    }
    public boolean isAna(String a,String b){
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}