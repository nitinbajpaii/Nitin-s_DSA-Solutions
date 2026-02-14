class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: deck){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int gcd=0;
        for(int count: map.values()){
            gcd = FindGcd(gcd,count);
        }
        return gcd>=2;

       
    }
    public int FindGcd(int i,int j){
        if(j==0){
            return i;
        }
        else{
            return FindGcd(j,i%j);
        }
    }
}