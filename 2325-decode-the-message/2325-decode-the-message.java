class Solution {
    public String decodeMessage(String key, String message) {
        char[] arr = new char[256];
        char ch ='a';
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<key.length();i++){
            if(key.charAt(i) ==' '){
                continue;
            }
            if(arr[key.charAt(i)] == '\u0000'){
                arr[key.charAt(i)] =ch;
                ch++;
            }
        }
        for(int i=0;i<message.length();i++){
            if(message.charAt(i) == ' ') sb.append(' ');
            else sb.append(arr[message.charAt(i)]);
        }
        return new String(sb);
    }
}