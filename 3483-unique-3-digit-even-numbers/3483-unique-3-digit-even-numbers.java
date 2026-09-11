class Solution {
    public int totalNumbers(int[] digits) {
        // Count frequencies of each digit (0-9)
        int[] counts = new int[10];
        for (int d : digits) {
            counts[d]++;
        }
        
        int totalEvenNumbers = 0;
        
        // Iterate through all possible 3-digit even numbers
        for (int num = 100; num <= 998; num += 2) {
            int a = num / 100;         // Hundreds place
            int b = (num / 10) % 10;   // Tens place
            int c = num % 10;          // Ones place
            
            // Track digits needed for the current number
            int[] required = new int[10];
            required[a]++;
            required[b]++;
            required[c]++;
            
            // Verify if the input array contains enough available digits
            boolean isValid = true;
            for (int i = 0; i < 10; i++) {
                if (required[i] > counts[i]) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                totalEvenNumbers++;
            }
        }
        
        return totalEvenNumbers;
    }
}
