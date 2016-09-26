
public class p279 {
    public static int numSquares(int n) {
        
        int result[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        	result[i]=Integer.MAX_VALUE;
        result[1]=1;
        result[0]=0;
        for(int i=1;i<=n;i++)
        	for(int j=1;j*j<=i;j++){
        		result[i]=Math.min(result[i],result[i-j*j]+1);
        	}
    	return result[n];
    }
    public static void main(String args[]){
       System.out.println(numSquares(12));	
    }
}
