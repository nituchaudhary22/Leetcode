class Solution {
    public int reverseDegree(String s) {
        int totalSum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Calculate the position in the reversed alphabet ('a' = 26, 'b' = 25, ...)
            int reversedAlphabetPos = 26 - (ch - 'a');
            
            // 1-indexed position in the string
            int stringPos = i + 1;
            
            // Add the product to the total sum
            totalSum += reversedAlphabetPos * stringPos;
        }
        
        return totalSum;
    }
}
