
public class p26 {
	  public static int removeDuplicates(int[] nums) {
	       int j=0;
	       for(int i=0;i<nums.length;i++){
	           
	           if(j==0||nums[i]>nums[j-1])
	        	 nums[j++]=nums[i];
	
	       } 
	       return j;
	    }
	  public static int removeDuplicates2(int[] nums) {
	  int i = 0;
	    for (int n : nums)
	        if (i == 0 || n > nums[i-1])
	            nums[i++] = n;
	    return i;
	  }
	  public static void display(int nums[],int len){
		  for(int i=0;i<len;i++)
			  System.out.print(nums[i]+" ");
		  System.out.println();
	  }
	  public static void main(String args[]){
		  int nums[]={1,1,2,2};
		  display(nums,removeDuplicates(nums));
		  display(nums,nums.length);
	  }
}
