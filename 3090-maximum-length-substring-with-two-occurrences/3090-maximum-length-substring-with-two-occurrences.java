class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // Include the current character in the window
            char rightChar = s.charAt(right);
            count[rightChar - 'a']++;

            // Shrink the window from the left if any character count exceeds 2
            while (count[rightChar - 'a'] > 2) {
                char leftChar = s.charAt(left);
                count[leftChar - 'a']--;
                left++;
            }

            // Update the maximum length of a valid substring
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
