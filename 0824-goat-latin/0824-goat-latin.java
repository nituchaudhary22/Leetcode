class Solution {
    public String toGoatLatin(String sentence) {
        String[] words =sentence.split(" ");
        StringBuilder ans =new StringBuilder();
        for(int i=0;i<words.length;i++){
            String word =words[i];
            char ch = Character.toLowerCase(word.charAt(0));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                ans.append(word);
            }else{
                ans.append(word.substring(1));
                ans.append(word.charAt(0));
            }
            ans.append("ma");
            for(int j=0;j<=i;j++){
                ans.append('a');
            }

            if(i!=words.length-1){
                ans.append(" ");
            }
            // ans.append("a".repeat(i + 1));
        }
        return ans.toString();
    }
}