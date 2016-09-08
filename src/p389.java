
public class p389 {
	public static char findTheDifference(String s, String t) {
        
		char re = 0;
        for(int i=0;i<s.length();i++){
            re^=s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
        	re^=t.charAt(j);
        }
        return re;
    }
	
	public static void main(String args[]){
		String s="abcdfgj";
		String t="abfdjghc";
		System.out.println((char)findTheDifference(s,t));
	}
}
