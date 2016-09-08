import java.util.Arrays;

public class p16 {
      public static int threeSumClosest(int[] nums, int target) {
         //Arrays.sort(nums);
         int min=Integer.MAX_VALUE;
         for(int i=0;i<nums.length-2;i++)
        	 for(int j=i+1;j<nums.length-1;j++){
        		 int dis=target-nums[i]-nums[j];
        		 //System.out.println(j);
        		 for(int k=j+1;(k<nums.length);k++){
        			 if(Math.abs(dis-nums[k])<=Math.abs(min)){
        				 min=dis-nums[k];
        			 //System.out.println(target-min);
        			 }
        		 }	 
        	 }
         //System.out.println(min);
         return (target-min);
      }
 /*
  * 对于这种情况  左边大于sum，右边小于sum，那么哪个更接近呢？
  * 
  * */
      public static int NbthreeSumClosest(int nums[],int target){
    	  
    	  Arrays.sort(nums);
    	  int min=nums[0]+nums[1]+nums[2];
    	  for(int i=0;i<nums.length-2;i++){
    		  int left=i+1;
    		  int right=nums.length-1;
    		  int sum=target-nums[i];
    		  while(left<right){
    			  if(sum==nums[left]+nums[right]) return target;
    			  else if(nums[left]+nums[right]>sum){
    				  while(left<right&&(nums[left]+nums[right]>sum)) right--;
    				  if(Math.abs(target-nums[i]-nums[left]-nums[right+1])<Math.abs(target-min))
                                       min=nums[left]+nums[right+1]+nums[i];
    			  }
    			  else{
    				  while(left<right&&(nums[left]+nums[right]<sum)) left++;
    				  if(Math.abs(target-nums[i]-nums[left-1]-nums[right])<Math.abs(target-min))
                                       min=nums[left-1]+nums[right]+nums[i];
    			  }
    		  }
    	  }
    	  return min;
      }
      public static int threeSumClosest1(int[] nums, int target) {
    	    if(nums.length<3) return 0;
    	    Arrays.sort(nums);
    	    int min = Integer.MAX_VALUE;int result =Integer.MAX_VALUE;
    	    for(int i=0;i<nums.length-2;i++)
    	    {
    	        if(3*nums[i]>target) 
    	        {
    	            int sum3 = nums[i]+nums[i+1]+nums[i+2];
    	            if(Math.abs(sum3-target)<min)  return sum3;
    	            //break;           //should break here but seems slower after adding it
    	        }
    	        int left = i+1; 
    	        int right = nums.length-1;
    	        int sum = target - nums[i];
    	        if(2*nums[right]<sum) {
    	            int sum2 = nums[i]+nums[right]+nums[right-1];
    	             if(Math.abs(sum2-target)<min){
    	                 min = Math.abs(target-sum2);
    	                 result = sum2;
    	             }
    	           continue;
    	        }
    	        while(left<right)
    	        {
    	            int temp = nums[i] + nums[left]+nums[right];
    	            if(temp==target) return target;
    	            if(2*nums[left]>sum) 
    	            {
    	              int sumsum = nums[i]+nums[left]+nums[left+1];
    	              if(Math.abs(sumsum-target)<min){
    	                  min = Math.abs(target-sumsum);
    	                  result = sumsum;
    	                }
    	               break;
    	            }
    	            else if(Math.abs(target-temp)<min)
    	            {
    	                min = Math.abs(target-temp);
    	                result = temp;
    	            }
    	            if(temp<target) 
    	               left++;
    	            else right --;
    	        }
    	    }
    	    return result;
    	    }
      public static void main(String args[]){
    	 // int s[]={-1,2,1,-4};
    	 // int s[]={1,2,4,8,16,32,64,128};
    	  int s[]={1,8,8,8,9,9};
    	  System.out.println(NbthreeSumClosest(s,20));
    	  System.out.println(threeSumClosest1(s,20));
      }
}
