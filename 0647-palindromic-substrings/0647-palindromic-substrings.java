class Solution {
    public int countSubstrings(String s) {
        int ans =0;
        int n =s.length();
        for(int i=0;i<n;i++){
            int oddLength =countPalindrome(s,i,i);
            int evenLength =countPalindrome(s,i,i+1);
            ans +=oddLength+evenLength;
        }
        return ans;
    }
    public int countPalindrome(String s,int i,int j){
        int count=0;
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            count++;
            j++;
            i--;
        }
        return count;
    }
}