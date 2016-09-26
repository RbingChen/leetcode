
public class p168 {
	 public static String convertToTitle(int n) {
		    StringBuilder re=new StringBuilder();
		    while(n>0){
		    	int m=n%26;
		    	if(m!=0){
		    		re.insert(0, (char)('A'+m-1));
		    	    n=(n-m)/26;
		    	    }
		    	else{
		    		re.insert(0,'Z');
		    		n=n/26-1;
		    	}
		    }
	        return re.toString();
	    }
	 public static String convertToTitle3(int n) {
		  int fac=26;String s="";
		    while(n>0){
		        n--;
		        s=(char)(n%26+'A')+s;
		        n/=fac;
		    }
		    return s;
		}
	 public static void main(String args[]){
		 System.out.println(convertToTitle(28));
	 }
}
