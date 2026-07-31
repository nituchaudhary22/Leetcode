class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int[] letters=new int[26];
        for(int i=0;i<brokenLetters.length();i++){
            letters[brokenLetters.charAt(i)-'a']++;
        }
        int count=0;
        String[] words = text.split(" ");
        for(String word:words){
            int i;
            for( i=0;i<word.length();i++){
                if(letters[word.charAt(i)-'a']>0){
                    break;
                }
            }
            if(i==word.length()){
            count++;
            }
        }
        return count;
    }
}