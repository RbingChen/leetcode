
public class p63 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	if(obstacleGrid==null) return 0;
    	if(obstacleGrid[0][0]==1) return 0;
	      int pathSum[][]=new int[obstacleGrid.length][obstacleGrid[0].length];  
	      pathSum[0][0]=1; 
	      for(int i=0;i<obstacleGrid.length;i++)
	    	   for(int j=0;j<obstacleGrid[0].length;j++){
	    		   if(obstacleGrid[i][j]==1) {
	    			   pathSum[i][j]=0;
	    		   }
	    		   else {
	    		       if(i!=0||j!=0){
	    		          if(i==0&&j>0){
	    			         pathSum[i][j]=pathSum[i][j-1];
	    		          }else if(j==0&&i>0){
	    			         pathSum[i][j]=pathSum[i-1][j];
	    		          }else {
	    			       pathSum[i][j]=pathSum[i-1][j]+pathSum[i][j-1];
	    		          }
	    		       }
	    		   }
	    	   }
	      
	      return pathSum[obstacleGrid.length-1][obstacleGrid[0].length-1];
	    }
    /*牛逼到不行呀   
     * 按行遍历，dp存着上一行的数，那么只需要加上左边的即可。判断都少了
     * */
    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int j = 0; j < width; j++) {
                if (row[j] == 1)
                    dp[j] = 0;
                else if (j > 0)
                    dp[j] += dp[j - 1];
            }
        }
        return dp[width - 1];
    }
	 public static void display(int nums[][]){
			
		   for(int i=0;i<nums.length;i++){
			   
		      for(int j=0;j<nums[0].length;j++){
			        System.out.print(nums[i][j]+" ");
		         }
		      System.out.println();
		   }
	   }
	 public static void main(String args[]){
		 int grid[][]={{0,0,0},{0,1,0},{0,0,0}};
		 display(grid);
		 System.out.println(uniquePathsWithObstacles(grid));
	 }
}
