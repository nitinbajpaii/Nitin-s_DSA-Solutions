class Solution {
    public int countDigits(int num) {
        int original = num;
        ArrayList<Integer> list = new ArrayList<>();
        while(num!=0){
            list.add(num%10);
            num /= 10;
        }
        int count=0;
        for(int i=0;i<list.size();i++){
            if(original % list.get(i)==0){
                count++;
            }
        }
        return count;

    }
}