
class Solution {
    public int missingInteger(int[] nums) {
        // Step 1: Calculate the sum of the longest sequential prefix
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break; // Stop as soon as the sequence breaks
            }
        }
        
        // Step 2: Store all elements in a set for O(1) lookups
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // Step 3: Find the smallest missing integer >= sum
        while (set.contains(sum)) {
            sum++;
        }
        
        return sum;
    }
}
