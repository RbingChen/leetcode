
public class p70 {
   public static int climbStairs(int n) {
       if(n<=2) return n;
	   int method[]=new int[n+1];
       method[0]=0;
       method[1]=1;
       method[2]=2;
       for(int i=3;i<n+1;i++){
    		   method[i]=method[i-1]+method[i-2];
	   }
	   return method[n];
    }
   public static void main(String args[]){
	   System.out.println(climbStairs(4));
   }
}
