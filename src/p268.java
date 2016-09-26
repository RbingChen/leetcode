/***可以是无序排列的数***/
public class p268 {
	 public static int missingNumber(int[] nums) {
		 int k=0;
	        for(int i=0;i<nums.length;i++){
	        	k=k^i^nums[i];
	        }
	     if(k==0)
	       return nums.length;
	     else return k^(nums.length);
	    }
	 public static void main(String args[ ]){
		 int nums[]={0,1,2,3,4,6,7};
		 System.out.println(missingNumber(nums));
	 }
}
