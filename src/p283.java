
public class p283 {
  public static void moveZeroes(int[] nums) {
        
        int j=0;
        for(int i=0;i<nums.length;i++){
        	while(nums[j]!=0&&j<i) j++;	
        	if(nums[i]!=0){
        			if(nums[j]==0){
        			int a=nums[i];
        			nums[i]=nums[j];
        			nums[j]=a;
        			}		
        		}
        	}  
    }
  public static void main(String args[]){
	  int nums[]={1,0,1,0,12};
	  moveZeroes(nums);
	  Display.display(nums);
  }
}
