class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
   /*   int largest=Integer.MIN_VALUE;
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            largest=Math.max(largest,grid[i][j]);
        }
     }*/
     int n=grid.length;

     int count[]=new int[n*n+1];
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            count[grid[i][j]]++;
        }
     }
     int ans[]=new int[2];
    
     for(int i=1;i<count.length;i++){
        if(count[i]==2){
           ans[0]=i;
           
        }else if(count[i]==0){
            ans[1]=i;
        }
     }
     return ans;
}
    
}