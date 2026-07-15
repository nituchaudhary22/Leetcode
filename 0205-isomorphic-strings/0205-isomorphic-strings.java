class Solution {
    public boolean isIsomorphic(String s, String t) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        char[] arr1 = new char[256];
        char[] arr2 = new char[256];

        char ch = 'a';

        for (int i = 0; i < s.length(); i++) {
            if (arr1[s.charAt(i)] == '\u0000') {
                arr1[s.charAt(i)] = ch;
                ch++;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            sb1.append(arr1[s.charAt(i)]);
        }

        ch = 'a';

        for (int i = 0; i < t.length(); i++) {
            if (arr2[t.charAt(i)] == '\u0000') {
                arr2[t.charAt(i)] = ch;
                ch++;
            }
        }

        for (int i = 0; i < t.length(); i++) {
            sb2.append(arr2[t.charAt(i)]);
        }

        return sb1.toString().equals(sb2.toString());
    }
}