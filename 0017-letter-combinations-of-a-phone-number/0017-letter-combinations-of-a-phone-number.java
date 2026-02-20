class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
        String map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits,0,new StringBuilder(),res,map);
            return res;
    }
    void backtrack(String digits,int index,StringBuilder curr,List<String> res, String[] map){
        if(index==digits.length()){
            res.add(curr.toString());
            return;
        }
        String letters = map[digits.charAt(index)-'0'];
        for(char ch: letters.toCharArray()){
            curr.append(ch);
            backtrack(digits,index+1,curr,res,map);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}