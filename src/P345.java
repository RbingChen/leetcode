
public class P345 {
	 public static String reverseVowels(String s) {
		    if(s==null) return s;
		    char st[]=s.toCharArray();
	        int i=0;
		    int j=st.length-1;
		    while(i<j){
		    	while(!help(st[i])&&i<j)i++;
		    	while(!help(st[j])&&i<j) j--;
		    	if(i<j) {
		    		char c=st[i];
		    		st[i]=st[j];
		    		st[j]=c;
		    		i++;
		    		j--;
		    	}
		    }
		    StringBuilder re=new StringBuilder();
		    re.append(st);
		    return re.toString();
	    }
	 public static boolean help(char c){
		 char str[]={'a','e','i','o','u','A','E','I','O','U'};
		 for(int i=0;i<str.length;i++){
			 if(c==str[i]) return true;
		 }
		 return false;
	 }
	 public static String reverseVowels2(String s){
		    if(s == null || s.length()==0) return s;
		    String vowels = "aeiouAEIOU";
		    char[] chars = s.toCharArray();
		    int start = 0;
		    int end = s.length()-1;
		    while(start<end){
		        
		        while(start<end && !vowels.contains(chars[start]+"")){
		            start++;
		        }
		        
		        while(start<end && !vowels.contains(chars[end]+"")){
		            end--;
		        }
		        
		        char temp = chars[start];
		        chars[start] = chars[end];
		        chars[end] = temp;
		        
		        start++;
		        end--;
		    }
		    return new String(chars);
		
	 }
	 public static void main(String args[]){
		 System.out.println(reverseVowels("hello"));
	 }
}
