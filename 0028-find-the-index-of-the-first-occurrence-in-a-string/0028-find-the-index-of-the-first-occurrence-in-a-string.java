class Solution {
    public int strStr(String haystack, String needle) {
        int index=0;
        if(haystack.contains(needle)){
        index = haystack.indexOf(needle);
    return index;
        }else{
            return -1;
        }
    }
}