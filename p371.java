
public class p371 {
	public static int getSum(int a, int b) {
        return b==0? a:getSum(a^b, (a&b)<<1);
    }
	
	public static void main(String args[]){
		System.out.println(getSum(1,2));
		System.out.println(getSum(2,2));
		System.out.println(getSum(2,3));
		System.out.println(1<<2);
	}
}
