class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(String w: dictionary){
            set.add(w);
        }
        String[] words = sentence.trim().split("\\s+");
        for(String w: words){
            String root=w;
            for(int i=1;i<=w.length();i++){
                String prefix =w.substring(0,i);
                if(set.contains(prefix)){
                    root= prefix;
                    break;
                }
            }
            sb.append(root).append(" ");
        }
        return sb.toString().trim();
    }
}