class Solution {
    public boolean halvesAreAlike(String str) {
        int n =str.length();
        String s = str.toLowerCase();
        int count1=0;
        int count2 =0;
        for(int i=0;i<(n/2);i++){
            if(s.charAt(i)=='a' || s.charAt(i) == 'i' || s.charAt(i) == 'e' || s.charAt(i) =='o'|| s.charAt(i) == 'u'){
                count1++;
            }
        }
        for(int i=(n/2);i<n;i++){
            if(s.charAt(i)=='a' || s.charAt(i) == 'i' || s.charAt(i) == 'e' || s.charAt(i) =='o'|| s.charAt(i) == 'u'){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        }
        return false;
    }
}