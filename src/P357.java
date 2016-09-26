
public class P357 {
    public static int countNumbersWithUniqueDigits(int n) {    
        int num[];
        if(n<11){
        	num=new int[n+1];
        }else{
        	num=new int[11];
        }
        num[0]=1;
        for(int i=1;i<=n&&i<11;i++){
        	num[i]=num[i-1]+fib(i);
        }
        if(n>=11) return num[10];
        
        return num[n];
    }
    public static int fib(int i){
    	int re=9;
    	int k=9;
    	for(int j=i-1;j>0;j--){
    		re=re*k;
    		k--;
    	}
    	return re;
    }
    
    public static int countNumbersWithUniqueDigits2(int n) {
         if(n==0) return 1;
         int res=10;
         int numcount=9;
         int nine=9;
         while(numcount>0&&n>1){
        	 nine=nine*numcount--;
        	 res+=nine;
        	 n--;
         }
         return res;
    }
    
    public static void main(String args[]){
    	System.out.println(countNumbersWithUniqueDigits2(3));
    }
}
