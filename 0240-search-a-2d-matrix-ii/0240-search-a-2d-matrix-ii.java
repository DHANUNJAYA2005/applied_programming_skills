class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      /*    int row=0;
        int col=matrix.length-1;
        while(row<matrix.length && col>=0){
            if(target==matrix[row][col]){
                return true;
            }else if(target>matrix[row][col]){
                  row++;
            }else{
                col--;
            }
        }
        return false;*/
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                  if(target==matrix[i][j]){
                    return true;
                  }
            }
         }
       return false;
    }
}