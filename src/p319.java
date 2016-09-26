
public class p319 {
	 public static int bulbSwitch(int n) {
	     if(n==1) return 1;
		 int left=n;
		 for(int i=1;i<n;i++){
	    	 if(isR(i+1)){
	    		 if(left/(i+1)!=0){
	    			 left=left-left/(i+1);
	    		 }else{
	    			 left=left-1;
	    		 }
	    	 }else{
	    		 if(left/(i+1)!=0){
	    			 left=left+left/(i+1);
	    		 }else{
	    			 left=left+1;
	    		 }
	    	 }
	     }   
		 return left;
	    }
  public static boolean isR(int num){
	  boolean flag = true;
	  if(num == 2) {
		  return flag;
	  }
      for(int i = 1; i < Math.sqrt(num); i++) {
		  if(num % 2 == 0) {
		     flag = false;
		     break;
		    }
       }
       return flag;
      }
  public static int bulbSwitch2(int n) {
	  int num[]=new int[n];
	  for(int i=0;i<n;i++){
		  num[i]=1;
	  }
	  for(int i=1;i<n;i++){
		  for(int j=1;j<=n/(i+1);j++){
			  num[j*(i+1)-1]^=1;
		  }

	  }

	  int sum=0;
	  for(int i=0;i<n;i++){
		  sum+=num[i];
	  }
	  return sum;
  }
   public static void main(String args[]){
	   System.out.println(bulbSwitch2(9999999));
	   System.out.println(Math.sqrt(9999999));
       
    }	 
}
