class Solution {
    public int titleToNumber(String columnTitle) {
        int ans =0;
        int n =columnTitle.length();
        for(int i=0;i<n;i++){
            char ch =columnTitle.charAt(i);
            ans =ans*26 +(ch-'A'+1);
        }
        return ans;
    }
}