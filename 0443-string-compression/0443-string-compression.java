class Solution {
    public int compress(char[] chars) {
        int read=0, write=0;
        while(read<chars.length){
            char curr = chars[read];
            int count=0;
            while(read<chars.length && chars[read]==curr){
                read++;
                count++;
            }
            chars[write++]=curr;
            if(count>1){
                String str = String.valueOf(count);
                for(char ch: str.toCharArray()){
                    chars[write++] = ch;
                }
            }
        }
        return write;
    }
}