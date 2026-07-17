class Solution {
    public int maxRepeating(String sequence, String word) {
        String repeated = "";
        int count = 0;
        while (true) {
            repeated += word;

           if (sequence.contains(repeated)) {
            count++;
            } else {
                 break;
    }
}

return count;
    }
}