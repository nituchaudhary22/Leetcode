class Solution {
    public boolean checkIfPangram(String sentence) {
        int n =sentence.length();
        boolean[] ans =new boolean[26];
        for(int i=0;i<n;i++){
            if(sentence.charAt(i) >= (char)(97) && sentence.charAt(i)<= (char)(122)){
                ans[sentence.charAt(i) -(char)(97)] = true;
            }
        }
        for(int i=0;i<26;i++){
            if(ans[i]==false){
                return false;
            }
        }
        return true;
    }
}