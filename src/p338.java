
public class p338 {
  public static int[] countBits(int num) {
	    int[] re=new int[num+1];
	    if(num==0) return re;
        if(num==1){re[1]=1;return re;}
         re[1]=1;
        int pow2=2;
        for(int i=2;i<=num;i++){
        	if(i==pow2) {re[i]=1;pow2=pow2*2;}
        	else{
        		re[i]=1+re[i-pow2/2];
        	}
        }
        return re;
    }
  public static void main(String args[]){
	  int re[]=countBits(8);
	  Display.display(re);
  }
}
