
public class p121 {
   public static int maxProfit(int[] prices) {
	   if(prices.length==1||prices.length==0) return 0; 
	   int min=0;
	    for(int i=1;i<prices.length;i++){
        	if(prices[i]>prices[i-1]){
        		for(int j=0;j<=i;j++){
        			int a=prices[i]-prices[j];
        			if(a>=0&&a>min) {min=a;}
        		}
        	}
        }
	    return min;
    }
   public static int maxProfit3(int[] prices){
	   int maxCur = 0, maxSoFar = 0;
	   for(int i = 1; i < prices.length; i++) {
           maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
           /*如果出现小于零的数，那么说明出现了一个更小的数*/
           maxSoFar = Math.max(maxCur, maxSoFar);
       }
       return maxSoFar;
   }
   public static int maxProfit2(int[] prices) {

        if(prices.length==1) return 0;
        int min=prices[1]-prices[0];
        if(min<0) min=0;
        int max=prices[1];
	    for(int i=1;i<prices.length;i++){
       	if(prices[i]>max){
       		min=prices[i]-max+min;
       		max=prices[i];
       	  }
       }
	    return min;
   }
   public static void main(String args[]){
	   int input[]={2,2,2,7,2,3,9};
	   int input2[]={7, 6, 4, 3, 1};
	   System.out.println(maxProfit3(input));
	   System.out.println(maxProfit3(input2));
   }
}
