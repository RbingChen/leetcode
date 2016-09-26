
public class p258 {
   public static int addDigits(int num) {
	    while(true){ 
	     int n=0;
		 while(num!=0){
			 
			 n+=(num%10);
			 num=num/10;
		 }
		 
		 if(n/10==0) return n;
		 else num=n;
		}
    }
}
