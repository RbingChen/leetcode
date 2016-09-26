import java.util.HashSet;
import java.util.Set;

public class p202 {
	 public static boolean isHappy(int n) {
		 int f=100;
		 int a=0;
		 while(f--!=0){
			 int sum=0;
			 while(n!=0){
				  a=(n%10);
				 sum+=a*a;
				 n=n/10;
			 }
			 System.out.println(sum);
			 if(sum==1) return true;
			 else n=sum;
		 }
	        return false;
	    }
	 
	 public static boolean isHappy2(int n){
		 Set<Integer> st=new HashSet<>();
		 while(true){
			 int sum=0;
			 while(n!=0){
				 sum+=(n%10)*(n%10);
				 n=n/10;
			 }
			 if(sum==1) return true;
			 else{
				 if(st.contains(sum)){return false;}
				 else {st.add(sum);n=sum;}
			 }
		 }
	 }
	 public static void main(String args[]){
		 System.out.println(isHappy2(536));
	 }
}
