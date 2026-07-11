class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = magazine.length();
        int[] frequency = new int[26];
        for(int i=0;i<n;i++){
            frequency[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            frequency[ransomNote.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(frequency[i]<0){
                return false;
            }
        }
        return true;
    }
}