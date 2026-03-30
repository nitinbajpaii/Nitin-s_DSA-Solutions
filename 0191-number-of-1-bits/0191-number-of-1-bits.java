class Solution {
    public int hammingWeight(int n) {
        StringBuilder res=new StringBuilder();
        while(n>0){
            if(n%2!=0){
                res.append("1");
            }
            else{
                res.append("0");
            }
            n=n/2;
        }
        String ans=res.toString();
        int count=0;

        for(int i=0; i<ans.length(); i++){
            if(ans.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}