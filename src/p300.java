import java.util.Arrays;

public class p300 {
    public static int lengthOfLIS(int[] nums) {
        if(nums.length==1) return 1;
        if(nums.length==0) return 0;
    	int max_now=1;
        int max_far=1;
    	for(int i=1;i<nums.length;i++){
        	if(nums[i]>nums[i-1]) {max_now++;}
        	else{
        		max_far=Math.max(max_far, max_now);
        		max_now=0;
        	}
        }
    	return max_far;
    }
    
    public static int lengthOfLIS2(int[] nums) {
    	if(nums.length==0) return 0;
    	int dp[]=new int[nums.length];
    	dp[0]=1;
    	for(int i=1;i<nums.length;i++){
    		dp[i]=1;
    		for(int j=0;j<i;j++){
    			if(nums[i]>nums[j]){
    				if(dp[i]<dp[j]+1)
    					dp[i]=dp[j]+1;
    			}
    		}
    		}
     Display.display(dp);
    	Arrays.sort(dp);
     
     return dp[nums.length-1];
    }
    /*  nlog(n)*/
    public int lengthOfLIS3(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int len = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > dp[len]) {
                dp[++len] = nums[i];
            }
            else {
                int index = search(dp, len, nums[i]);
                dp[index] = nums[i];
            }
        }
        return len + 1;
    }

    private int search(int[] dp, int len, int val) {
        int start = 0;
        while(start <= len) {
            int mid = start + (len - start) / 2;
            if(dp[mid] == val) {
                return mid;
            }
            else if(dp[mid] < val) {
                start = mid + 1;
            }
            else {
                len = mid - 1;
            }
        }
        return start;
    }
    public static void main(String args[]){
    	int nums[]={10,9,2,5,3,7,101,18};
    	System.out.println(lengthOfLIS2(nums));
    }
}
