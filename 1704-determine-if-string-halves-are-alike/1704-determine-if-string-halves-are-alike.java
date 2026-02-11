class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int m = n/2;
        String a = s.substring(0,m);
        String b = s.substring(m,n);
        a=a.toLowerCase();
        b=b.toLowerCase();
        String vowel = "aeiou";
        int count1=0;
        for(char ch: a.toCharArray()){
            if(vowel.indexOf(ch)!=-1){
                count1++;
            }
        }
        int count2 =0;
        for(char ch:b.toCharArray()){
            if(vowel.indexOf(ch)!=-1){
                count2++;
            }
        }
        return count1==count2;
    }
}