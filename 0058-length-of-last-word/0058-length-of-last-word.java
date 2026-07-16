class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count =0;
        int n =s.length()-1;
        while(n>=0 && s.charAt(n) != ' '){
            count++;
            n--;
        }
        return count;
    }
}