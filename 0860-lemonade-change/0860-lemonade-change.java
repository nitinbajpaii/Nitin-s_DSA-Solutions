class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int n: bills){
            if(n==5){
                five++;
            }
            else if(n==10){
                if(five==0){
                    return false;
                }
                else{
                    five--;
                    ten++;
                }
            }
            else{//20
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}