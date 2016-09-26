
public class p48 {
  public static void rotate(int[][] matrix) {
        int n=matrix.length;
        int mid=n/2;
        int count=n-1;
        for(int i=0;i<=mid;i++)
            for(int j=i;j<=mid;j++){
            	//if(i==j){
            		
            		int ki=i,kj=j;
            		System.out.println(" i j : "+i+" "+j);
            		int a=matrix[ki][kj];
            		for(int k=0;k<3;k++){      			
            			if(k==0){
            				//System.out.println("hang:"+(n-1-ki)+" "+ki+"-->"+ki+" "+kj+" k "+k);
            				matrix[ki][kj]=matrix[n-1-ki][ki];
            				kj=ki;
            				ki=n-1-ki;
            				//System.out.println("After hang :"+ki+" "+kj);

            			}else if(k==1){
            				//System.out.println("lie :"+(n-1-kj)+" "+ki+"-->"+ki+" "+kj+" k "+k);
            				matrix[ki][kj]=matrix[n-1-kj][ki];
            				
            				ki=n-1-kj;
            				kj=ki;
            			//	System.out.println("After lie :"+ki+" "+kj);
            				
            			}else if(k==2){
            			//	System.out.println("hang: "+(n-ki-1)+" "+ki+"-->"+ki+" "+kj+" k "+k);
                            matrix[ki][kj]=matrix[n-1-ki][ki];
                            kj=ki;
                            ki=n-1-ki;
                            
                          //  System.out.println("After hang :"+ki+" "+kj);
            			}
            	//	}
            		matrix[ki][kj]=a;
            	}
            }
    }
  public void rotate3(int[][] matrix) {
      int n = matrix.length, temp;
		for(int i = 0; i < n / 2; i++)
			for(int j = i; j < n - i - 1; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[n - j - 1][i];
				matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
				matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
				matrix[j][n - i - 1] = temp;
			}
  }
  public void rotate2(int[][] matrix) {
      for(int i = 0; i<matrix.length; i++){
          for(int j = i; j<matrix[0].length; j++){
              int temp = 0;
              temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;
          }
      }
      for(int i =0 ; i<matrix.length; i++){
          for(int j = 0; j<matrix.length/2; j++){
              int temp = 0;
              temp = matrix[i][j];
              matrix[i][j] = matrix[i][matrix.length-1-j];
              matrix[i][matrix.length-1-j] = temp;
          }
      }
  }
  public static void rorate(int matrix[][]){
	  int n=matrix.length;
	  for(int i=0;i<n/2;i++)
		  for(int j=i;j<n-i-1;j++){
			  System.out.println(i+" "+j);
			  int tmp=matrix[i][j];
			  matrix[i][j]=matrix[n-j-1][i];
			  matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
			  matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
			  matrix[j][n-i-1]=tmp;
		  }
  }
  public static void main(String args[]){
	  int num[][]={{1,2,3,4,5},
			  {6,7,8,9,10},
			  {11,12,13,14,15},
			  {16,17,18,19,20},
			  {21,22,23,24,25}};
	  
	  rorate(num);
	  Display.display(num);
	  }
}
