
public class p162 {
	/*
	 * 牛逼呀*/
	public int findPeakElement(int[] nums) {
	 for(int i = 1; i < nums.length; i ++)
     {
         if(nums[i] < nums[i-1])
         {// <
             return i-1;
         }
     }
     return nums.length-1;
 }
	
	static int findPeakElement2(int []num) 
    {/*不出现连等的数字才可能有效*/
        int low = 0;
        int high = num.length-1;
        
        while(low < high)
        {
            int mid1 = (low+high)/2;
            int mid2 = mid1+1;
            if(num[mid1] < num[mid2])
                low = mid2;
            else
                high = mid1;
        }
        return low;
    }
	public static void main(String args[]){
		int num[]={1,2,3,1,1,1,1,1,1,4,1,1};
		System.out.println(findPeakElement2(num));
	}
}
