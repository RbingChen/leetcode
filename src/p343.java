/*
 * 
 * 分解的过程中注意n，n-i也是一种情况
 * */
public class p343 {
   public static int integerBreak(int n) {
       if(n<2||n>58) return 0; 
       
	   int result[]=new int[n+1];
	   result[2]=1;
	   result[1]=1;
	   
	  int tmp=helper(result,n);
	  
	  return tmp;
    }
   public static int helper(int result[],int n){
	   if(result[n]!=0) return result[n];
       for(int i=1;i<=n-1;i++){
    	   result[n]=Math.max(Math.max(helper(result,i)*(n-i), i*(n-i)), result[n]);
       }
       return result[n];
   }
   public static void main(String args[]){
	   System.out.println(integerBreak(10));
   }
}
