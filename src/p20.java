import java.util.Stack;

public class p20 {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++){
        	char ch=s.charAt(i);
        	if(st.isEmpty()) st.push(ch);
        	else{
        		char tmp=st.pop();
        	
        		if(ch=='}'){
        			if(tmp!='{'){st.push(tmp);st.push(ch);}
        		}else if(ch==']'){
        			if(tmp!='['){st.push(tmp);st.push(ch);}
        		}else if(ch==')'){
        			if(tmp!='('){st.push(tmp);st.push(ch);}
        		}
        	}
        }
        
        return st.isEmpty();
    }
    public  static boolean isValid2(String s) {
        Stack<Character> st=new Stack();
          for(int i=0;i<s.length();i++){
          	char ch=s.charAt(i);
          	if(st.isEmpty()) st.push(ch);
          	else{
          		char tmp=st.pop();
          	
          		if(ch=='}'){
          			if(tmp!='{'){st.push(tmp);st.push(ch);}
          		}else if(ch==']'){
          			if(tmp!='['){st.push(tmp);st.push(ch);}
          		}else if(ch==')'){
          			if(tmp!='('){st.push(tmp);st.push(ch);}
          		}else{st.push(tmp);st.push(ch);}
          		
          	}
          }
          
          return st.isEmpty();
      }
    public static void main(String args[]){
    	System.out.println(isValid2("}}"));
    	char ch1='{';
    	char ch2='}';
    	
    	System.out.println();
    }
}
