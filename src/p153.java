
public class p153 {
    public static int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
    	int left=0;
        int right=nums.length-1;
        while(left<right){
        	int mid=(left+right)/2;
        	if(nums[mid]>nums[right]){
        		left=mid+1;
        	}
        	else right=mid;
        }
        return nums[right];
    }
    public static void main(String args[]){
    	int nums1[]={4,5,6,7,0,1,2,3};
    	int nums2[]={1,1,1,1};
    	System.out.println(findMin(nums1));
    	System.out.println(findMin(nums2));
    }
}
