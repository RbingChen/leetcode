
public class p69 {
     public static int mySqrt1(int x) {
    	double g=1;
    	while((g*g)-x>0.00001){
    		g=(g+x/g)/2;
    	}
    	return (int)g;
    }
     public static int mySqrt(int x) {
     	if(x<=4){
     		if(x==4) return 2;
     		else if(x==0) return 0;
     		else return 1;
     	}
     	else if(4<x&&x<9) return 2;
    	int end=x/2;
     	int begin=0;
     	int k=(end+begin)/2;
     	while(begin<end){
     		if(k==begin) return k;
     		if(k*k<x) begin=k;
     		else if(k*k==x) return k;
     		else end=k;
     		k=(end+begin)/2;
     	}
		return 0;
     }
     public static void main(String args[]){
    	 System.out.println(mySqrt(5));
    	 System.out.println(mySqrt(4));
    	 System.out.println(mySqrt(9));
    	 System.out.println(mySqrt(16));
    	 System.out.println(mySqrt(25));
    	 System.out.println(mySqrt(30));
    	 System.out.println(mySqrt(2147395599));
     }
}
