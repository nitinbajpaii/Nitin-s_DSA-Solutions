class Solution {
    public int passwordStrength(String password) {
        int ans=0;
        HashSet<Character> set = new HashSet<>();

        for(char ch: password.toCharArray()){
            if(set.contains(ch)){
                continue;
            }
            if(Character.isUpperCase(ch)){
                ans += 2;
            }
            else if(Character.isLowerCase(ch)){
                ans += 1;
            }
            else if(Character.isDigit(ch)){
                ans += 3;
            }
            else{
                ans += 5;
            }
            set.add(ch);
        }
        return ans;
    }
}