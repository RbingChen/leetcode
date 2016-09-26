
public class p189 {
	public static void rotate(int[] nums, int k) {
		k=k%nums.length;
		if(k==0) return;
		

	}
	public void rotate2(int[] nums, int k) {
	    k %= nums.length;
	    reverse(nums, 0, nums.length - 1);
	    reverse(nums, 0, k - 1);
	    reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	        int temp = nums[start];
	        nums[start] = nums[end];
	        nums[end] = temp;
	        start++;
	        end--;
	    }
	}
	public static void main(String args[]){
		int nums[]={1,2,3,4,5,6};
		rotate(nums,2);
		Display.display(nums);
	}
	
}
