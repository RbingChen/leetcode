
public class p367 {
    public static boolean isPerfectSquare(int num) {
        if(num<4) {
        	if(num==0||num==1) return true;
        	else return false;
        }
    	int left=0;
    	int mid=0;
        int right=num;
        if(num==Integer.MAX_VALUE) return false;
        while(left<right){
        	mid=(left+right)/2;
        	if(mid>46340) mid=46340;
        	if(num==mid*mid) return true;
        	if(mid==left) break;
        	else if(num<mid*mid) {right=mid;}
        	else left=mid;
        	
        }
    	return false;
    }
  public static void main(String args[]){
	  System.out.println(isPerfectSquare(2147483647));
	  System.out.println(Math.sqrt(2147483647));
  }
}
