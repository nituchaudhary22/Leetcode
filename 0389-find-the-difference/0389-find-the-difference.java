class Solution {
    public char findTheDifference(String s, String t) {
        int[] freqS = new int[26];
        for(int i=0;i<s.length();i++){
            freqS[s.charAt(i)-'a']--;
        }
        for(int i=0;i<t.length();i++){
            freqS[t.charAt(i)-'a']++;
        }
        char ch = 'a';
        for(int i=0;i<26;i++){
            if(freqS[i]>0){
                ch = (char)(i+'a');
            }
        }
        return ch;
    }
}