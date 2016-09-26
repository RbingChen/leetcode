import java.util.Arrays;

public class p313 {
   public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] re= new int[n];
        re[0]=1;
        int p[]=new int[primes.length];
       // int tmp[]=new int[primes.length];
        for(int i=1;i<n;i++){
        	re[i]=Integer.MAX_VALUE;
        	for(int pj=0;pj<primes.length;pj++){
        		while(re[p[pj]]*primes[pj]<=re[i-1])
        			  p[pj]++;
        		re[i]=Math.min(re[i], re[p[pj]]*primes[pj]);
        	}
        	
        	//Arrays.sort(tmp);
        	//re[i]=tmp[0];
        }
        return re[n-1];
    }
   
   public static void main(String args[]){
	   int primes[]={2,7,13,19};
	   System.out.println(nthSuperUglyNumber(12,primes));
   }
}
