
public class P74 {
	 public static boolean searchMatrix(int[][] matrix, int target) {
		    int n=matrix.length;
		    int m=matrix[0].length;
		    int num_len=n*m;
		    int k=0;
		    int j=n-1;
		    int mid=(j+k)/2;
		   // int b=matrix[j];
		    if((target==matrix[0][0])||(target==matrix[0][m-1])||(target==matrix[j][0])||(target==matrix[j][m-1])) 
		    	return true;
		    if(target<matrix[0][0])
		    	return false;
		    if(target>matrix[j][m-1])
		        return false;
		    if(k==j) return douCut(matrix,k,m,target);
		    while(k<j){
		    	if(j-k==1){
		    		//System.out.println(j+" "+k+" "+mid);
		    		if(target==matrix[mid][0]||target==matrix[mid][m-1])
		    			return true;
		    		else if(target<matrix[j][0])
		    			return douCut(matrix,k,m,target);	
		    		else if(target>matrix[j][0])
		    			return douCut(matrix,j,m,target);	
		    	}
		    	else{
		    		if(target==matrix[mid][0])
			    		return true;
			    	else if(target<matrix[mid][0]){
			    		j=mid;
			    		mid=(k+j)/2;
			    	   }
			    	else if(target>matrix[mid][0]){
			    		 k=mid;
			    		 mid=(k+j)/2;
			    		}
			    	}
		    	}
		     return false;
		    }
	 public static boolean douCut(int matrix[][],int mid,int m,int target){
		   int col=mid;
		   int k=0;
		   int j=m-1;
			mid=(j+k)/2;
			System.out.println(matrix[col][mid]+" "+mid+" "+matrix[col][j]+" "+j+" "+m);
			while(mid<j){
				System.out.println(matrix[col][mid]+" "+mid+" "+matrix[col][j]+" "+j+" "+m);
				if(target==matrix[col][mid]){
				   return true;
				}
				else if(target<matrix[col][mid]){
					j=mid;
				    mid=(j+k);
				}
			    else if(target>matrix[col][mid]){
					k=mid;
				    mid=(j+k)/2;
				}
				if(j-mid==1){
					if(target==matrix[col][mid]||target==matrix[col][j]){
						return true;
					}
					else return false;				
					}
				
				}
		return false;
	 }
	 public static boolean searchMatrix2(int[][] matrix, int target) {
		    int n=matrix.length;
		    int m=matrix[0].length;
		    int begin=0;
		    int end=n*m-1;
		    int mid=(end+begin)/2;
		    if((target==matrix[0][0])||(target==matrix[0][m-1])||(target==matrix[n-1][0])||(target==matrix[n-1][m-1])) 
		    	return true;
		    if(target<matrix[0][0])
		    	return false;
		    if(target>matrix[n-1][m-1])
		        return false;
		    while(true){
		    	System.out.println(getEle(matrix,mid,n,m));
		    	if(getEle(matrix,mid,n,m)==target)
		    		return true;
		    	else if(getEle(matrix,mid,n,m)>target){
		    		end=mid;
		    		mid=(end+begin)/2;
		    	}
		    	else {
		    		begin=mid;
		    		mid=(end+begin)/2;
		    	}
		    	if(end-mid==1){
		    		if(getEle(matrix,mid,n,m)==target||getEle(matrix,end,n,m)==1)
		    			return true;
		    		else return false;
		    	}
		    }
			//return false;
		    
	 }
	 public static int getEle(int[][] matrix,int num,int n,int m){
		 int ha=num/m;
		 int li=num-ha*m;
		 return matrix[ha][li];
	 }
	 public static boolean searchMatrix3(int[][] matrix, int target) {
		  int n=matrix.length;
		    int m=matrix[0].length;
		    int begin=0;
		    int end=n*m-1;
		    
		    if(target<matrix[0][0])
		    	return false;
		    if(target>matrix[n-1][m-1])
		        return false;
		    while(begin!=end){
		    	int mid=(end+begin)/2;
		    	if(matrix[mid/m][mid%m]<target){
		    		begin=mid+1;
		    	}
		    	else
		    		end=mid;
		    }
		    return matrix[end/m][end%m]==target;
	 }
	 public static void main(String args[]){
		 int[][] num={{1,3,5,7},{9,9,9,9},{10, 11, 16, 20},{23, 30, 34, 50}};;
		 int [][] num1={{1}};
		 int [][] num2={{-9,-7,-7,-5,-3},{-1,0,1,3,3},{5,7,9,11,12},{13,14,15,16,18},{19,21,22,22,22}};
		 //System.out.println(num.length);
		 System.out.println(searchMatrix3(num,20));
		// System.out.println(searchMatrix(num1,3));
		// System.out.println(getEle(num,1,4,4));
		// System.out.println(searchMatrix(num2,-4));
		// System.out.println(num[9]);
	 }
}
