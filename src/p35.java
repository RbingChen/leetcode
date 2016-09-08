
public class p35 {
      public static int searchInsert(int[] nums, int target) {
          int low=0;
          int high=nums.length-1;
          if(target<=nums[low]) return 0;
          if(target>nums[high]) return nums.length;
          while(low<high){
        	  int mid=(low+high)/2;
        	  if(nums[mid]<target) low=mid+1;
        	  else high=mid;
          }
          
    	  return low;
    }
      public static int searchInsert2(int[] nums, int target) {
          int low=0;
          int high=nums.length-1;
          
          if(target>nums[high]) return nums.length;
          while(low<high){
        	  int mid=(low+high)/2;
        	  if(nums[mid]<target) low=mid+1;
        	  else high=mid;
          }
          
    	  return low;
    }
      public static void main(String args[]){
    	  int num[]={1,3,5,6};
    	  int num1[]={1,2};
    	  System.out.println(searchInsert2(num1,0));
    	  System.out.println(searchInsert2(num1,5));
    	  System.out.println(searchInsert2(num1,2));
    	  System.out.println(searchInsert2(num1,7));
      }
}
