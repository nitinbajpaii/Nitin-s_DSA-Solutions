class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char ch:moves.toCharArray()){
            switch(ch){
             case 'U' : x++; break;
             case 'D' : x--; break;
             case 'R' : y++; break;
             case 'L' : y--; break;
            }
            
        }
        return x==0 && y==0;
    }
}