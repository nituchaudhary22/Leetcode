class Solution {
    public int[][] imageSmoother(int[][] img) {
       int m =img.length;
        int n =img[0].length;
        int[] dr ={-1,-1,-1,0,0,0,1,1,1};
        int[] dc={-1,1,0,-1,1,0,-1,1,0};
        int[][] ans =new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                int count=0;
                for(int k=0;k<9;k++){
                    int nr = i+dr[k];
                    int nc =j+dc[k];
                    if(nr>=0 && nr <m &&nc>=0 && nc<n){
                        sum += img[nr][nc];
                        count++;
                    }
                }
                ans[i][j] =sum/count;
            }
        }
        return ans;
    }
}