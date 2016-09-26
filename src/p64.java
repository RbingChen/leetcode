
public class p64 {
	 public static int minPathSum(int[][] grid) {
		  if(grid==null) return 0;
	      int pathSum[][]=new int[grid.length][grid[0].length];  
	      pathSum[0][0]=grid[0][0]; 
	      for(int i=0;i<grid.length;i++)
	    	   for(int j=0;j<grid[0].length;j++){
	    		   if(i!=0||j!=0){
	    		   if(i==0&&j>0){
	    			   pathSum[i][j]=pathSum[i][j-1]+grid[i][j];
	    		   }else if(j==0&&i>0){
	    			   pathSum[i][j]=pathSum[i-1][j]+grid[i][j];
	    		   }else {
	    			   pathSum[i][j]=Math.min(pathSum[i-1][j],pathSum[i][j-1])+grid[i][j];
	    		   }
	    		   }
	    	   }
	      return pathSum[grid.length-1][grid[0].length-1];
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
		 int grid[][]={{1,7,2,3},{2,1,1,1}};
		 display(grid);
		 System.out.println(minPathSum(grid));
	 }
}
