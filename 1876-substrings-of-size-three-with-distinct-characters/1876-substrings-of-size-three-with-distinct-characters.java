class Solution {
    public int countGoodSubstrings(String s) {
        int count =0;
        int i =0;
        for(int j=0;j<s.length();j++){
            if(j-i+1 == 3){
                if(s.charAt(i)!= s.charAt(i+1) && (s.charAt(i+1)!= s.charAt(j)) && (s.charAt(j) != s.charAt(i)) ){
                    count++;
                }
                i++;
            }
        }
        return count;
    }
}