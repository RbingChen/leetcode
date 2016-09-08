
public class p154 {
    public static int findMin(int[] nums) {
        if(nums.length==1) return 1;
        int right=nums.length-1;
        while(right>0){
        	if(nums[right]>=nums[right-1]) right=right-1;
        	else break;
        }
       // System.out.println(right);
        return right;
    }
    public static int findMin2(int[] nums){
    	if(nums.length==1) return 1;
    	int right=nums.length-1;
    	int left=0;
    	while(left<right){
    		int mid=(left+right)/2;
    		if(nums[right]<nums[mid]) left=mid+1;
    		else if(nums[right]>nums[mid]) right=mid;
    		else{
    			if(nums[mid]==nums[left]) left++;
    			else if(nums[left]>nums[mid]) right=mid;
    		}
    	}
    	return nums[left];
    }
    public static int findMin3(int []nums){
    	if(nums.length==1) return 1;
    	int right=nums.length-1;
    	int left=0;
    	while(left<right){
    		int mid=(left+right)/2;
    		if(nums[right]<nums[mid]) left=mid+1;
    		else if(nums[right]>nums[mid]) right=mid;
    		else{
    			right--;
    		}
    	}
    	return nums[left];
    }
    public static void main(String args[]){
    	int num3[]={1,1,3,0,0,0,0,0,0,0,0,0,1,1,1};
		int num2[]={2,2,4,4,5,5,6,6,7,7,0,0,1,1,2};
		
		System.out.println(findMin3(num3));
    }
}
