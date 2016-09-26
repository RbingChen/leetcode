
public class p62 {
	 public static int uniquePaths(int m, int n){
		  if(m==0&&n==0) return 0;
	      int pathSum[][]=new int[m][n];  
	      pathSum[0][0]=1; 
	      for(int i=0;i<m;i++)
	    	   for(int j=0;j<n;j++){
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
	      return pathSum[m-1][n-1];
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
		 System.out.println(uniquePaths(3,3));
	 }
}

