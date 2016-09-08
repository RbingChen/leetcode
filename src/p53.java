
public class p53 {
	 public static int maxSubArray(int[] nums) {
		    if(nums.length==0) return 0;
		  //  if(nums.length==1) return 1;
		    int max_total=nums[0];
		    int max_now=nums[0];
		    for(int i=1;i<nums.length;i++){
		    	max_now=Math.max(0, max_now+=nums[i]);
		    	max_total=Math.max(max_now, max_total);
		    }
	        return max_total;
	    }
	 public static int maxSubArray2(int [] nums){
		 return 0;
	 }
}
