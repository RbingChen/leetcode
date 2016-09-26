
public class p273 {
	static String numE[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
    		"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    static String numE1[]={"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    static String wei[]={"","Thousand","Million","Billion"};
    static String hud="Hundred";
    static String than="Thousand";
    static String mili="Million";
   public static String numberToWords(int num) {
	   String str=numberToWords2(num);
	   StringBuilder st=new StringBuilder();
	   int count=1;
	   if(str.charAt(0)!=' ') st.append(str.charAt(0));
	   while(str.charAt(count)==' '){
		count++;   
	   }
	   for(int i=count;i<str.length();i++){
		   if(((i==str.length()-1)&&str.charAt(i)!=' ')||((str.charAt(i-1)!=' '||str.charAt(i)!=' '))){
			   st.append(str.charAt(i));
		   }
	   }
	   
	   return st.toString();
   }
   public static String numberToWords2(int num) {
        if(num==0) return "Zero";
        String str="";
        if(num/1000000000!=0){
        	str=Hund(num/1000000000)+" Billion";
        	num=num%1000000000;
        	if(num==0) return str;
        }
        if(num/1000000!=0){
        	str=str+" "+thous(num/1000000)+" "+mili;
        	num=num%1000000;
        	if(num==0) return str;
        }
       
        if(num/1000!=0){
        	 str=str+" "+Hund(num/1000)+" "+than;
        	 num=num%1000;
        	 if(num==0) return str;
        	 str=str+" "+Hund(num);
        	 return str;
         }
        str=str+" "+Hund(num);
        
        return str;
    }
   public static String thous(int num){
	   String re="";
	   if(num/1000!=0)
		   {re=numE[num/1000-1]+" "+than;num=num%1000; if(num==0) return re;}
      re=re+" "+Hund(num);
      return re;
   }
   public  static String Hund(int num){
       if(num==0) return "";
	   String re="";
       int a=num/100;
       if(a>0){
    	   re=re+" "+numE[a-1]+" Hundred";
    	   num=num-100*a;
    	   if(num==0) return re;
       }
	    if(num<20) re=re+" "+numE[num-1];
        else if(num<100){
       	 if(num/10!=0) {re=re+" "+numE1[num/10-2];num=num-10*(num/10);}
       	 if(num!=0) re=re+" "+numE[num-1]; 
       }
       return re;   
   }
   
   public static String numberToWords1(int num){
	   if(num==0) return "Zero";
	   String str="";
	   int i=0;
	   while(num!=0){
		   int a=num%1000;
		   if(a!=0){
		       str=Hund2(a)+" "+wei[i]+" "+str;
		    }
		   i++;
		   num=num/1000;
	   }
	   if(str.charAt(0)==' '){
		   str=str.substring(0);
	   }
	   if(str.charAt(str.length()-1)==' '){
		   str=str.substring(0,str.length()-1);
	   }
	   return str;
   }
   public  static String Hund2(int num){
       if(num==0) return "";
	   String re="";
	   int a=num/100;
	   int b=num%100;
	   int c=b/10;
	   int d=b%10;
	   if(a!=0) re=numE[a-1]+" Hunderd";
	   if(b!=0){
		   if(c>=2){
			   re=re+" "+numE1[c-2];
			   if(d!=0)
			    re=re+" "+numE[d-1];
		   }else if(c==0){
			   re=re+" "+numE[d-1];
		   }else{
			   if(d!=0){
			     re=re+" "+numE[b-1];
			     }else{
			    	 re=re+" "+numE[9];
			     }
		   }
	   }
       return re;   
   }
   public static void main(String args[]){
	   System.out.println(numberToWords1(1231));
   }
}
