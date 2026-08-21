class Solution {
    public int minimumLength(String s) {
        int right =s.length()-1;
        int left =0;
        while(left<right && s.charAt(left)==s.charAt(right)){
            char ch =s.charAt(left);
            while(left <=right && ch == s.charAt(left)){
                left++;
            }
            while(left<=right && ch == s.charAt(right)){
                right--;
            }
        }
        return right-left+1;
    }
}