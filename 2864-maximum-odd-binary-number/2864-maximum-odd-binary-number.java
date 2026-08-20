class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb =new StringBuilder();
        int n  =s.length();
        int count =0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        if(count == 1){
            for(int i=0;i<n-1;i++){
            sb.append('0');
        }
        sb.append('1');
        }
        if(count > 1){
            for(int i=0;i<count-1;i++){
                sb.append('1');
            }
            for(int i=count-1;i<n-1;i++){
                sb.append('0');
            }
            sb.append('1');
        }
        return sb.toString();
    }
}