
public class p344 {
	 public static String reverseString(String s) {
	        if(s==null) return s;
	        StringBuilder st=new StringBuilder();
	        for(int i=0;i<s.length();i++){
	        	st.append(s.charAt(s.length()-1-i));
	        }
	        return st.toString();
	    }
}
