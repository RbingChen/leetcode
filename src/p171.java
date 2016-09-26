
public class p171 {
   public static int titleToNumber(String s) {
       int sum=0;
	   for(int i=0;i<s.length();i++){
		   
		  
    	   sum+=(s.charAt(i)-65+1)*Math.pow(26, s.length()-1-i);
       } 
	   
	   return sum;    
    }
   public static int titleToNumber2(String s) {
       int sum=0;
	   for(int i=0;i<s.length();i++){
		   
		  
    	   sum+=sum*26+(s.charAt(i)-65+1);
       } 
	   
	   return sum;    
    }
   public static void main(String args[]){
	   System.out.println(titleToNumber("AB"));
	   System.out.println('A'-'A');
	   System.out.println(Math.pow(26, 2));
   }
}
