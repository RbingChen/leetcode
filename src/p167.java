
public class p167 {
   public int[] twoSum(int[] numbers, int target) {
        int nums[]=new int[2];
        int i=0;
        int j=numbers.length-1;
        while(i<j){
        	if(numbers[i]+numbers[j]>target){j--;}
        	else if(numbers[i]+numbers[j]<target){i++;}
        	else break;
        }
        nums[0]=i+1;
        nums[1]=j+1;
        return nums;
    }
}
