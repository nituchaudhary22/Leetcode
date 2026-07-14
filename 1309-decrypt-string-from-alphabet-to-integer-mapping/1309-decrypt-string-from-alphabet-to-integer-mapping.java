class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
                sb.append((char) ('a' + num - 1));
                i += 3; 
            } else {
                int num = s.charAt(i) - '0';
                sb.append((char) ('a' + num - 1));
                i++; 
            }
        }
        return sb.toString();
    }
}