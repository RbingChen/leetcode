
public class p324 {
    public static boolean isPowerOfFour(int num) {
    	return num > 0 && (num & (num - 1)) == 0 && (num - 1) % 3 == 0;
   
    	
    }
    public static boolean isPowerOfTwo(int num) {
    	//return num > 0 && (num & (num - 1)) == 0 && (num - 1) % 3 == 0;
   
   
    	while(num>1){
    		if((num&1)!=0) return false;
    		else num=num>>1;
    		//System.out.println(x);
    	}
    	if(num==1) return true;
    	else return false;
    }
    
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int  
        return ( n>0 &&  1162261467%n==0);
    }
    
    public static void main(String args[]){
    	System.out.println(isPowerOfFour(4));
    	System.out.println(isPowerOfFour(16));
    	System.out.println(isPowerOfFour(8));
    	System.out.println(isPowerOfTwo(1073741825));
    	System.out.println(1<<31);
    }
}
