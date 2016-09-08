
public class p198 {
	public static int rob(int[] nums) {
         int res[]=new int[nums.length];
         int res2[]=new int[nums.length];
         for(int i=0; i<nums.length;i++)
        	 {res[i]=-1;
        	  res2[i]=-1;
        	 }
    	 return Math.max(recur(nums,nums.length-1,res), recur(nums,nums.length-2,res2));
    }
     public static int recur(int nums[],int i,int res[]){
    	  if(i<0) return 0;
    	  else if(i==0) {return nums[0];}
    	  else{
    		  if(res[i]>=0) return res[i];
    		  else{
    		      res[i]=Math.max(recur(nums,i-2,res)+nums[i],recur(nums,i-3,res)+nums[i]);
    		      return res[i];
    		   }
    	  }
     }
     public static int rob2(int[] num) {
     int[][] dp = new int[num.length + 1][2];
     for (int i = 1; i <= num.length; i++) {
         dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
         dp[i][1] = num[i - 1] + dp[i - 1][0];
     }
     return Math.max(dp[num.length][0], dp[num.length][1]);
 }
     public static void main(String args[ ]){
    	 int nums[]={100,1,1,100,1,1,100,1,1,100};
    	 int nums2[]={100,2,3,4,5,6,7,8,9,10};
    	 int nums3[]={226,174,214,16,218,48,153,131,128,17,157,142,88,43,37,157,43,221,191,68,206,23,225,
    			 82,54,118,111,46,80,49,245,63,25,194,72,80,143,55,209,18,55,122,65,66,177,101,63,201,172,130,103,
    			 225,142,46,86,185,62,138,212,192,125,77,223,188,99,228,90,25,193,211
    			 ,84,239,119,234,85,83,123,120,131,203,219,10,82,35,120,180,249,106,37,169,225,54,103,55,166,124};
    	 System.out.println(rob(nums3));
    	 System.out.println(rob2(nums3));
     }
}
