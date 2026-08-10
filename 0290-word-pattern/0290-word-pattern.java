class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Object, Integer> indexMap = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            if (!Objects.equals(indexMap.put(c, i), indexMap.put(word, i))) {
                return false;
            }
        }
        
        return true;
    }
}
