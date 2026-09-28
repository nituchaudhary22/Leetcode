class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low = 1;
        long minRank = ranks[0];
        for (int r : ranks) {
            minRank = Math.min(minRank, r);
        }
        
        long high = minRank * cars * cars;
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long totalCars = 0;

            for (int r : ranks) {
                totalCars += (long) Math.sqrt((double) mid / r);
            }

            if (totalCars >= cars) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
