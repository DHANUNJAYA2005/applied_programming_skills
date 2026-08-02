class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol;j++){
                ans.add(matrix[startrow][j]);
            }
             for(int j=startrow+1;j<=endrow;j++){
                ans.add(matrix[j][endcol]);
            }
             for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                ans.add(matrix[endrow][j]);
            }
             for(int j=endrow-1;j>=startrow+1;j--){
                if(startcol==endcol){
                    break;
                }
                ans.add(matrix[j][startcol]);
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return ans;
    }
}