
public class p263 {
	 public static boolean isUgly(int num) {
	  	  if(num<=0) return false;  
			  while(true){
			    	while(num%2==0&&num!=0&&num!=1){
			    		num=num/2;
			    	}
			    	while(num%3==0&&num!=0&&num!=1){
			    		num=num/3;
			    	}
			    	while(num%5==0&&num!=0&&num!=1){
			    		num=num/5;
			    	}
			    	if(num==0||num==1) break;
			    	else return false;
			    }
			    
		        return true;
		    }
	 public static boolean isUgly2(int num) {
	  	  if(num<=0) return false;  
			  for(int i=2;i<6&&num>0;i++){
				  while(num%i==0){
					  num/=i;
				  }
			  }
			  return num==1;
		    }

	 public static void main(String args[]){
		 System.out.println(isUgly(-2147483648));
	 }
}
