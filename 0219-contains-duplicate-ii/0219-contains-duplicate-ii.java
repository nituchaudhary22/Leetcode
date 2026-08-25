import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the set already contains the current number, we found a duplicate within distance k
            if (window.contains(nums[i])) {
                return true;
            }
            
            // Add the current number to our window
            window.add(nums[i]);
            
            // Keep the window size at most k
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}
