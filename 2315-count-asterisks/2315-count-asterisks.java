class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int barcount=0;
        int n =s.length();
        int i=0;
        while(i<n){
            if(s.charAt(i) =='|'){
                barcount++;
            }
            if(barcount%2==0){
                if(s.charAt(i) =='*'){
                    count++;
                }
            }
            i++;
        }
        return count;
    }
}