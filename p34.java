
public class p34 {
	 
	public static int[] searchRange(int[] nums, int target) {
		   int end=nums.length-1;
		   int begin=0;
		   int re[]={-1,-1};
		   if(end==begin){
			   if(nums[0]==target){re[0]=0;re[1]=0;return re;}
			   else return re;
		   }
		   boolean flag=false;
		   int mid=0;
		   while(end>begin){
			   mid=(end+begin)/2;
			   if(nums[mid]==target){
				   flag=true;break;
			   }else if(nums[mid]<target){
				   begin=mid+1;
			   }else end=mid-1;
		   }
		   if(target==nums[mid+1]&&target==nums[end]){ mid=mid+1;flag=true; }
		   if(flag){
			   re[0]=mid;re[1]=mid;
			   while(re[1]<nums.length-1&&target==nums[re[1]+1]) re[1]++;
			   while(re[0]>0&&target==nums[re[0]-1]) re[0]--;
		   }
		   
		   return re;
	        
	    }
	 public static void display(int nums[]){
		 for(int i=0;i<nums.length;i++){
			 System.out.print(nums[i]+" ");
		 }
	 }
	 public static int[] searchRange2(int[] nums, int target){
		  return Support(nums,target,0,nums.length-1); 
	 }
	 public static int [] Support(int[] nums,int target,int low,int high){
		 if(nums[low]==target&&nums[high]==target) return new int[]{low,high};
		 if(nums[low]<=target&&nums[high]>=target){
			 int mid=(high+low)/2;
			 int left[]=Support(nums,target,low,mid);
			 int right[]=Support(nums,target,mid+1,high);
			 if(left[0]==-1) return right;
			 if(right[0]==-1) return left;
			 return new int[]{left[0],right[1]};
		 }
		 return new int[]{-1,-1};
	 }
	 public static int [] searchRange3(int[] nums,int target){
		 int low=0;
		 int high=nums.length-1;
	     int re[]={-1,-1};
		 while(low<high){
			 int mid=(low+high)/2;
			 if(nums[mid]<target) low=mid+1;
			 else high=mid;
			 System.out.println(mid+" "+high+" "+low);
		 }
		 if(nums[low]!=target) return re;
		 re[0]=low;
		 high=nums.length-1;
		 while(low<high){
			 int mid=(low+high)/2+1;///加1很关键，使结果偏向右侧.这和整数除法的特性是有关的。
			 if(nums[mid]>target) high=mid-1;
			 else low=mid;
			 
		 }
		 re[1]=low;
		 return re;
	 }
	 public static void main(String args[]){
		 int num[]={5, 7, 7, 8, 8, 10};
		 int num1[]={2,2,2,2,2,2};
		 int num2[]={1,2,3};
		 display(searchRange3(num2,2));
	 }
}
