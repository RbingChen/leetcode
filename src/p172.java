
public class p172 {
    public static int trailingZeroes(int n) {
        int re=0;
        while(n!=0){
            re+=n/5;n=n/5;
        }
        return re;
    }
    public static void main(String args[]){
    	System.out.println(trailingZeroes(25));
    }
}
