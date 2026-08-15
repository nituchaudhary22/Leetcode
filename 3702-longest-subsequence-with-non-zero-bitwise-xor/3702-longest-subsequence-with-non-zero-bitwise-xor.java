class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXOR = 0;
        boolean hasNonZero = false;
        
        // Single pass to find cumulative XOR and verify if a non-zero element exists
        for (int num : nums) {
            totalXOR ^= num;
            if (num != 0) {
                hasNonZero = true;
            }
        }
        
        // If the entire array has a non-zero XOR, return the full length
        if (totalXOR != 0) {
            return nums.length;
        }
        
        // If total XOR is 0, we must remove one non-zero element (if it exists)
        return hasNonZero ? nums.length - 1 : 0;
    }
}
