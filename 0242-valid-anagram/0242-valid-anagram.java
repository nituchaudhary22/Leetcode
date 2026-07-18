class Solution {
    public boolean isAnagram(String s, String t) {
        int n =s.length();
        int m  =t.length();
        int[] freq =new int[26];
        if(m!=n) return false;
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}