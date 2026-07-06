class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n  =grid.length;
        int[] rowmax=new int[n];
        int[] colmax =new int[n];
        for(int  i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]> rowmax[i]){
                    rowmax[i] =grid[i][j];
                }
                if(grid[i][j]>colmax[j]){
                    colmax[j]=grid[i][j];
                }
            }
        }
        int totalIncrease =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int height=0;
                if(rowmax[i]<colmax[j]){
                    height=rowmax[i];
                }else{
                    height =colmax[j];
                }
                totalIncrease += height-grid[i][j];
            }
        }
        return totalIncrease;
    }
}