
public class p213 {
	 public static int rob(int[] nums) {
	      if(nums.length==0) return 0;
	      if(nums.length==1) return nums[0];
	      if(nums.length==2) return Math.max(nums[0], nums[1]);
	      int dp1[][]=new int [nums.length][2];
	      dp1[0][0]=0;
	      dp1[1][0]=0;
	      for(int i=1;i<nums.length;i++){
	    	  dp1[i][0]=Math.max(dp1[i-1][0], dp1[i-1][1]);
	    	  dp1[i][1]=dp1[i-1][0]+nums[i];
	      }
	      
	      int dp2[][]=new int [nums.length-1][2];
	      dp2[0][0]=0;
	      dp2[1][0]=nums[0];
	      dp2[0][1]=0;
	      dp2[1][1]=dp2[1][0];
	      for(int i=2;i<nums.length-1;i++){
	    	  dp2[i][0]=Math.max(dp2[i-1][0], dp2[i-1][1]);
	    	  dp2[i][1]=dp2[i-1][0]+nums[i];
	      }
	      return Math.max(Math.max(dp1[nums.length-1][0], dp1[nums.length-1][1]), 
	    		  Math.max(dp2[nums.length-2][0], dp2[nums.length-2][1]));
	    }
	
	 public static void main(String args[]){
		 int nums[]={1,12};
		 System.out.println(rob(nums));
	 }
}
