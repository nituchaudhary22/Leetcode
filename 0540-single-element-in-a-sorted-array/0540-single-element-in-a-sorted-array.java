class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // Check if mid is correctly paired with its neighbor
            if (nums[mid] == nums[mid ^ 1]) {
                // The single element is further to the right
                low = mid + 1;
            } else {
                // The single element is at mid or to the left
                high = mid;
            }
        }
        
        return nums[low];
    }
}
