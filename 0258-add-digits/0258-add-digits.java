class Solution {
    int addDigits(int num) {
        //M1
//         int ans=-1;
//         if(num==0)return 0;
        
//         if(num/10==0)return num;
//         else{
//             while(num>9){
//             int sum=0;
//             int first_digit=(num/10);
//             int second_digit=(num%10);
//             sum+=first_digit+second_digit;
//             int check=sum/10;
//             if(check==0)
//             {
//                 ans=sum;
//                 break;
                
//             }
//             else num=sum;
//          }
//         }
            
//         return ans;
        
        //M2
        
        if(num==0)return 0;
        
        if(num%9==0)return 9;
        
        else return num%9;
        
    }
};