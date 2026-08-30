class Solution {
    public int countPrimes(int n) {
        // Base case: no primes strictly less than 2
        if (n <= 2) {
            return 0;
        }
        
        // Array tracks if numbers are prime (indexed 0 to n-1)
        boolean[] isPrime = new boolean[n];
        // Assume all numbers are prime initially
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        // Sieve algorithm: mark multiples of primes as false
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count remaining true values
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}
