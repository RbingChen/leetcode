import java.util.PriorityQueue;

public class p264 {
	 public static int nthUglyNumber(int n) {
		  
		  int num[]=new int[n];
		  num[0]=1;
		  int p=0;
		  for(int i=1;i<n;i++){
			  num[i]=Integer.MAX_VALUE;
			  for(int j=p;j<i;j++){
			    if(num[j]*2>num[i-1]){
			    	if(num[j]<=Integer.MAX_VALUE/2){
			    	num[i]=Math.min(num[i], num[j]*2);
			    	}
			    }else if(num[j]*3>num[i-1]){
			    	if(num[j]<=Integer.MAX_VALUE/3){
			    	num[i]=Math.min(num[i], num[j]*3);
			    	}
			    }else{
			    	if(num[j]<=Integer.MAX_VALUE/5){
			    	  num[i]=Math.min(num[i], num[j]*5);
			    	}
			    }
			    if(num[i]==num[i-1]){
			       num[i]=Integer.MAX_VALUE;
			       p++;
			    }
			 }
		  }
	        return num[n-1];
	    }
	 /**************************************/
	 public int nthUglyNumber3(int n) {
		    int[] a = new int[n];
		    a[0] = 1;
		    int p2 = 0, p3 = 0, p5 = 0;
		    for (int i = 1; i < n; i++) {
		        while (2 * a[p2] <= a[i - 1]) {
		            p2++;
		        }
		        while (3 * a[p3] <= a[i - 1]) {
		            p3++;
		        }
		        while (5 * a[p5] <= a[i - 1]) {
		            p5++;
		        }
		        a[i] = Math.min(2 * a[p2], Math.min(3 * a[p3], 5 * a[p5]));
		    }
		    return a[n - 1];
		}
	 /*优先队列**************************/
	 public int nthUglyNumber2(int n) {
		    if(n==1) return 1;
		    PriorityQueue<Long> q = new PriorityQueue();
		    q.add(1l);
		    
		    for(long i=1; i<n; i++) {
		        long tmp = q.poll();
		        while(!q.isEmpty() && q.peek()==tmp) tmp = q.poll();
		        
		        q.add(tmp*2);
		        q.add(tmp*3);
		        q.add(tmp*5);
		    }
		    return q.poll().intValue();
		}
	 public static void main(String args[ ]){
		 System.out.println(nthUglyNumber(1600));
		 System.out.println(Integer.MAX_VALUE);
	 }
}
