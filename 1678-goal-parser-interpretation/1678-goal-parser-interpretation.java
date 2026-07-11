class Solution {
    public String interpret(String command) {
        int n =command.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(command.charAt(i)=='G'){
                sb.append("G");
            }else if(command.charAt(i) =='(' && command.charAt(i+1)==')'){
                sb.append("o");
                i++;
            }else{
                sb.append("al");
                i+=3;
            }

        }
        return new String(sb);
    }
}