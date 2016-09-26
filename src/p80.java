
public class p80 {
    public static int removeDuplicates(int[] nums) {
        if(nums==null) return 0;
        int k=1;
        int j=0;
    	for(int i=1;i<nums.length;i++){
    		if(nums[i]==nums[j]){
    			if(i-j<2) {nums[k++]=nums[i];}		
    		}else{
    			j=i;nums[k++]=nums[i];
    		}
    	}
    	Display.display(nums);
    	return k;
    }
    public int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }
    public static void main(String args[]){
    	int nums[]={1,1,1,2,2,2,2,2,2,2,2,3,3,3,4,5,6};
    	System.out.println(removeDuplicates(nums));
    }
}
