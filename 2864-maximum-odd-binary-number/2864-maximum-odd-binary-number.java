class Solution {
    public String maximumOddBinaryNumber(String s) {
        int left=0;
        int right =s.length()-1;
        char[] ch = s.toCharArray();
        while(left<right){
            if(ch[left] =='1'){
                left++;
            }else if(ch[right]=='0'){
                right--;
            }else{
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] =temp;
                left++;
                right--;
            }
        }
            for(int i=s.length()-1;i>=0;i--){
                if(ch[i]=='1'){
                char tempo = ch[i];
                ch[i]=ch[s.length()-1];
                ch[s.length()-1] = tempo;
             }
            }
        return String.valueOf(ch);
    }
}