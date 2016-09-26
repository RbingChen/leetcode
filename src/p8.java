
public class p8 {
	 public static int myAtoi(String str) {
		 if(str.length()==0) return 0;
		 int flag=1;
		 int count=0;
		 while(str.charAt(count)==' '){
			 count++;
			// System.out.println(count);
		 }
		 String str1=str.substring(count);//去掉开头的空白字符
		 count=0;
		 //解耦加减号
		 while(count<str1.length()&&((str1.charAt(count)=='-')||(str1.charAt(count)=='+'))){
		       if(str1.charAt(count)=='-')   
		       { flag*=-1; }
		       count++;
		 }
		// System.out.println(str1);
		 if(count>1) return 0;
		 double re=0;
			 boolean fl=false;
			 boolean f2=false;
			 for(int i=count;i<str1.length();i++){
				 char ch=str1.charAt(i);
				  if(ch!='0'||fl||f2) {   
  
		        		  int tmp=0;
		        		  if((ch>='0'&&ch<='9')){
				              tmp=(int)(ch-'0');
				          }else{
				        	  break;
				          }
		        		   re=re*10+tmp*flag;
				           fl=true; 
		         }else if(ch=='0'){
		        	 f2=true;//进入数字区域，可以进行判断了、
		         }
			 }
		 
		 if(re>Integer.MAX_VALUE) re=Integer.MAX_VALUE;
		 if(re<Integer.MIN_VALUE) re=Integer.MIN_VALUE;
		 return (int)re;
	    }
	 public static void main(String args[ ]){
		 System.out.println(myAtoi("  -0012a42"));
		 System.out.println(myAtoi("  +  - a010"));
		 System.out.println(myAtoi("  -  123"));
		 System.out.println(myAtoi("  +  123"));
		 System.out.println(myAtoi("  0123"));
		 System.out.println(myAtoi("2147483648"));
	 }
}

/*if(ch>='a'&&ch<='z'){
				        	   tmp=(int)(ch-'a')+9;
				          }else if(ch>='A'&&ch<='Z'){
				        	   tmp=(int)(ch-'A')+9;
				          }else {
				        	  return */