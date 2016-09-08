
public class p50 {
	 public static double myPow(double x, int n) {
	     if(x==1||x==0) return x;
		 if(n<0){
			 if(n%2==0){ int t=n/2;double k=1./threeP(x,-t);return k*k; }
			 
			 else return 1.0/threeP(x,-n);
	     }
	     else return threeP(x,n);
	    }
	
	 public static double threeP(double x,int n){
		 if(n==1) return x;
		 if(n==0) return 1;
		 if(n%3==0) {
			          double t=threeP(x,n/3);
			          return t*t*t;
		 }else if(n%3==2){
			 double t=threeP(x,(n-2)/3);
			 return t*t*t*x*x;
		 }else {
			 double t=threeP(x,(n-1)/3);
			 return t*t*t*x;
		 }
	 }
	 
	 
	 public static double doubleP(double x,int n){
		 if(n==1) return x;
		 if(n==0) return 1;
		 if(n%2==0) {
			          double t=doubleP(x,n/2);
			          return t*t;
		 }else{
			 double t=doubleP(x,(n-1)/2);
			 return t*t*x;
		 }	 
	 }
	 public static void main(String args[]){
		 System.out.println(myPow(2,3));
		 System.out.println(myPow(2,4));
		 System.out.println(myPow(2.1,8));
		 System.out.println(myPow(2,0));
		 System.out.println(myPow(34.0015,-3));
		 int n=-2147483648;
		 System.out.println(myPow(2,n));
		 System.out.println(-2%2);
	 }
}
