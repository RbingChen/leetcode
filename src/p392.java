
public class p392 {
   public static boolean isSubsequence(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        int dp[][]=new int[slen+1][tlen+1];
       
        for(int i=1;i<=slen;i++)
        	for(int j=1;j<=tlen;j++){
        		if(s.charAt(i-1)==t.charAt(j-1)){
        			dp[i][j]=dp[i-1][j-1]+1;
        			if(dp[i][j]==slen) return true;
        		}else{
        			dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
        		}
        	}
     //  Display.display(dp);
       return dp[slen][tlen]==slen;
    }
   public static boolean isSubsequence2(String s,String t){
	   int slen=s.length();
       int tlen=t.length();
       
       int i=0;
       for(int j=0;j<tlen;j++){
    	   if(t.charAt(j)==s.charAt(i)){
    		   i++;
    		   if(i==slen) return true;
    	   }
       }
       return i==tlen;
   }
   public static void main(String args[]){
	   String s="ace";
	   String t="kace";
	   System.out.println(isSubsequence(s,t));
   }
}
