class Solution {
    public void swap(int[][] arr,int i,int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    public void rotate(int[][] mat){
        int n  =mat.length;
       for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
            swap(mat,i,j);
        }
       } 
    for(int i=0;i<n;i++){
    int left=0;
    int right =n-1;
    while(left<right){
        int temp =mat[i][left];
        mat[i][left]=mat[i][right];
        mat[i][right]=temp;
        left++;
        right--;
    }
    }
    }
    public boolean isSame(int[][]mat,int[][] target){
        int n=mat.length;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]!=target[i][j]){
                return false;
            }
        }
    }
    return true;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
      for(int i=0;i<4;i++){
        if(isSame(mat,target)){
            return true;
        }
        rotate(mat);
      }
      return false;
    }
}