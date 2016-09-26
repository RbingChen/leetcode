
public class p67 {
	 public static String addBinary(String a, String b) {
	        int aLen=a.length();
	        int bLen=b.length();
	        int len=0;
	        String lg,sg;
	        if(aLen>bLen) {len=bLen;lg=a;sg=b;}
	        else {len=aLen;lg=b;sg=a;}
	        int flag=0;
	        int tem;
	        StringBuilder re=new StringBuilder();
	        for(int i=len-1,j=lg.length()-1;i>=0;i--,j--){
	        	tem=lg.charAt(j)+sg.charAt(i)-'0'-'0'+flag;
	       
	        	if(tem>=2){
	        		re.insert(0,(char)(tem-2+'0'));
	        		flag=1;
	        	}else{
	        		re.insert(0,(char)(tem+'0'));
	        		flag=0;
	        	}
	        	
	        }
	        for(int j=lg.length()-len-1;j>=0;j--){
	        	tem=lg.charAt(j)-'0'+flag;
	        	if(tem>=2){
	        		re.insert(0,tem-2);
	        		flag=1;
	        	}else{
	        		re.insert(0,(char)(1+'0'));
	        	}
	        }
	       
	        if(flag==1) re.insert(0,(char)(1+'0'));
	        return re.toString();
	    }
	 public static void main(String args[]){
		 System.out.println(addBinary("1010","1011"));
	 }
}
