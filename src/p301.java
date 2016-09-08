import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class p301 {
     public static List<String> removeInvalidParentheses(String s) {
         ArrayList<String> re=new ArrayList<>();
         Queue<String> queue=new LinkedList<>();
         Set<String> visited= new HashSet<>();
         queue.add(s);
         visited.add(s);
         boolean flag=false;
         while(!queue.isEmpty()){
        	 String tmp=queue.poll();
        	 System.out.println(flag);
        	 if(isValid(tmp)){
        		 re.add(tmp);
                 flag=true;
        	 }
        	 if(flag) continue;
        	 for(int i=0;i<tmp.length();i++){
        		 if(tmp.charAt(i)!='('&&tmp.charAt(i)!=')') continue;
        		  String st=tmp.substring(0,i)+tmp.substring(i+1);
        		  if(!visited.contains(st)){
        			  queue.add(st);
        			  visited.add(st);
        		  }
        	 }
         }
    	 return re;  
    	 }
      public static boolean isValid(String tp){
    	  int count=0;
    	  for(int i=0;i<tp.length();i++){
    		  if(tp.charAt(i)=='(') count++;
    		  if(tp.charAt(i)==')'&&count--==0){
    			 return false;
    		  }
    	  }
    	  return count==0;
      }
      public static void display(List<String> st){
    	  for(String s : st){
    		  System.out.println(s);
    	  }
      }
      
   /************************************************************/
      public List<String> removeInvalidParentheses2(String s) {
    	    List<String> ans = new ArrayList<>();
    	    remove(s, ans, 0, 0, new char[]{'(', ')'});
    	    return ans;
    	}

   public void remove(String s, List<String> ans, int last_i, int last_j,  char[] par) {
     for (int stack = 0, i = last_i; i < s.length(); ++i) {
    	     if (s.charAt(i) == par[0]) stack++;
    	     if (s.charAt(i) == par[1]) stack--;
    	     if (stack >= 0) continue;
    	     for (int j = last_j; j <= i; ++j)
    	          if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1]))
    	              remove(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, par);
    	        return;//如果stack>=0,而且最后i循环到最后的时候，将会跳出循环。stack>0的情况，对应于下面的字符串翻转
    	    }
    	String reversed = new StringBuilder(s).reverse().toString();
    	 if (par[0] == '(') // finished left to right
    	      remove(reversed, ans, 0, 0, new char[]{')', '('});
    	  else // finished right to left
    	      ans.add(reversed);
    	}
   /*//////////////////////////////////////////////////////////////////////*、
    * 
    */
   public static List<String> removeInvalidParentheses3(String s) {
		Set<String> res = new HashSet<>();
		int rmL = 0, rmR = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') rmL++;
		    if(s.charAt(i) == ')') {
		    	if(rmL != 0) rmL--;
		    	else rmR++;
		    }
		}
		DFS(res, s, 0, rmL, rmR, 0, new StringBuilder());
	    return new ArrayList<String>(res);	
	}

	public static void DFS(Set<String> res, String s, int i, int rmL, int rmR, int open, StringBuilder sb) {
	    if(i == s.length() && rmL == 0 && rmR == 0 && open == 0) {
	    	res.add(sb.toString());
	    	return;
	    }
	    if(i == s.length() || rmL < 0 || rmR < 0 || open < 0) return;
	    
	    char c = s.charAt(i);
	    int len = sb.length();
	   
		if(c == '(') {
			DFS(res, s, i + 1, rmL - 1, rmR, open, sb);
			DFS(res, s, i + 1, rmL, rmR, open + 1, sb.append(c)); 
			
		} else if(c == ')') {
			DFS(res, s, i + 1, rmL, rmR - 1, open, sb);
			DFS(res, s, i + 1, rmL, rmR, open - 1, sb.append(c));
			
		} else {
			DFS(res, s, i + 1, rmL, rmR, open, sb.append(c)); 
		}
		
		sb.setLength(len);
	}
	
     public static void main(String args[]){
    	 String st="())(";
    	 display(removeInvalidParentheses3(st));
     }
    
}
