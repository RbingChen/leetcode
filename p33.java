import java.util.ArrayList;
import java.util.List;
public class p33 {
	 public static int search(int[] nums, int target) {
          int begin=0;
          int end=nums.length-1;
          int rot=0;
   /*计算出转折点，就是最小值处*/
          while(begin<end){
        	  int mid=(begin+end)/2;
        	  if(nums[mid]>nums[end]) begin=mid+1;
        	  else end=mid;
          }
   ///*************************************************/
           rot=end;
          System.out.println("rot"+rot);
          if(target<=nums[nums.length-1]){
        	  begin=rot;
        	  end=nums.length-1;
          }else{
        	  begin=0;
        	  end=rot-1;
          }
	      while(begin<end){
	    	  int mid=(begin+end)/2;
	    	  if(target>nums[mid]) begin=mid+1;
	    	  else end=mid;
	      }
	     System.out.println(" "+end+" "+rot);
	     if(nums[end]==target) return end;
	      return -1;
	    }
	 
	 public static int search2(int[] nums, int target) {
         int begin=0;
         int end=nums.length-1;
  /*计算出转折点，就是最小值处*/
         while(begin<end){
       	  int mid=(begin+end)/2;
       	  if(nums[mid]>nums[end]) begin=mid+1;
       	  else end=mid;
       	  
         }
  ///*************************************************/
         int rot=end;
		return rot;
	    }
	 public static void main(String args[]){
		 int num[]={4,5,6,7,0,1,2,3};
		 int num3[]={1,1,3,1};
		 int num2[]={2,2,4,4,5,5,6,6,7,7,0,0,1,1,2};
		 System.out.println(search(num,3));
	 }
}
