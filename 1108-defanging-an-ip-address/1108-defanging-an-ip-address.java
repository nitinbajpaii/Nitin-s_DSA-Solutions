class Solution {
    public String defangIPaddr(String address) {
        String words = address.replace(".","[.]");
        return words;
        
    }
}