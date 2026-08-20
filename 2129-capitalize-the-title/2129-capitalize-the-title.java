class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder result =new StringBuilder();
        int n = words.length;
        for(int i=0;i<n;i++){
            String word  =words[i];
            if(word.length() <=2){
                result.append(word.toLowerCase());     
            }else{
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
            }
            if(i< words.length -1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}