class Solution {
    public String largestGoodInteger(String num) {
        for(int i=9;i>=0;i--){
            String triplet =String.valueOf(i).repeat(3);
            if(num.contains(triplet)){
                return triplet;
            }
        }
        return "";
    }
}