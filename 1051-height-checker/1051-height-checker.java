class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        for(int h:heights) freq[h]++;
        int count =0;
        int currentheight=1;
        for(int i=0;i<heights.length;i++){
            while(freq[currentheight]==0){
                currentheight++;
            }
            if(heights[i] != currentheight){
                count++;
            }
            freq[currentheight]--;
        }
        return count;
    }
}