class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();
        pattern = createMapping(pattern);
        for(int i=0;i<words.length;i++){
            if(createMapping(words[i]).equals(pattern)){
                list.add(words[i]);
            }
        }
        return list;
    }
    static String createMapping(String s){
        char[] arr =new char[256];
        char ch ='a';
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]=='\u0000'){
                arr[s.charAt(i)]=ch;
                ch++;
            }
        }
        for(int i=0;i<s.length();i++){
            sb.append(arr[s.charAt(i)]);
        }
    return new String(sb);
    }
}