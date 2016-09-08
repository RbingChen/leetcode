
public class p81 {
	 public static boolean search(int[] nums, int target) {
         int begin=0;
         int end=nums.length-1;
         int rot=0;
         if(end==begin) return nums[0]==target;
         if(nums[end]==nums[begin]){
       	  while(end>begin&&nums[end]==nums[end-1]) end--;
       	  if(end==begin) return nums[begin]==target;
       	  else if(end>begin&&nums[end]<nums[end-1]) rot=end;
       	  else{
       		      end=nums.length-1;
       	          while(begin<end){
       	       	  int mid=(begin+end)/2;
       	       	  if(nums[mid]>nums[end]) begin=mid+1;
       	       	  else end=mid;
       	         }
       	  }
         }
         else{
        	 end=nums.length-1;
  	         while(begin<end){
  	       	    int mid=(begin+end)/2;
  	       	    if(nums[mid]>nums[end]) begin=mid+1;
  	       	    else end=mid;
  	          }
         }
         rot=end;
         if(target<=nums[nums.length-1]){
       	  begin=rot;
       	  end=nums.length-1;
         }else{
       	  begin=0;
       	  end=rot-1;
         }
         
	     while(begin<end){
	    	  int mid=(begin+end)/2;
	    	  if(target>=nums[mid]) begin=mid+1;
	    	  else end=mid;
	      }
	     System.out.println(" "+end+" "+rot);
	    return nums[begin]==target;
	    }
	 public static boolean search2(int[] nums, int target) {
         int begin=0;
         int end=nums.length-1;
         int mid=0;
         while(begin<=end){
        	 mid=(begin+end)/2;
        	 if(nums[mid]==target) return true;
        	 if(nums[begin]<nums[mid]){
        		 if(nums[begin]<=target&&nums[mid]>target) end=mid-1;
        		 else begin=mid+1;
        	 }else if(nums[begin]>nums[mid]){
        		 if(nums[mid]<target&&nums[end]>=target) begin=mid+1;
        		 else end=mid-1;
        	 }else begin++;
         }
         return false;    
	 }
	 public static void main(String args[]){
		 int num[]={4,5,6,7,0,1,2};
		 int num3[]={1,1,3,1};
		 int num4[]={1,1};
		 int num5[]={1,3};
		 int num2[]={2,2,4,4,5,5,6,6,7,7,0,0,1,1,2};
		 int num6[]={2,2,2,2,0,2,2,2};
		 System.out.println(search(num4,1));
		 System.out.println(search2(num5,4));
		 System.out.println(search2(num6,0));
	 }
}
