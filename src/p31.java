/*
 * 分两部分：找到第一个逆序对（i-1,i）....(4,5)
 * (i-1) 放置i-nums.length-1 的最大数
 * i后面的数反转，为了使得在当前情况下的逆序对最多？？？
 * 
 * [7,2,5,4,3,1]找到[2,5],此时,找到次大于2的值，后num.length-1开始查找，必然是第一个大于2的数便是
 * 交换[7,3,5,4,2,1],最后逆序转换（翻转）
 * /
 */
public class p31 {
   public static void nextPermutation(int[] nums) {
       if(nums.length<=1) return;

   int k=0;
	for(int j=nums.length-1;j>=1;j--){
			if(nums[j]>nums[j-1]){
			    k=j;
				break;
			}
			Display.display(nums);
	}
  if(k!=0)  swap(nums,k-1);
   System.out.println("here");
   reverse(nums,k);
   Display.display(nums);
 
}
private static void swap(int []nums,int i){
    for(int f=nums.length-1;f>i;f--){
        if(nums[f]>nums[i]){
	          int a=nums[f];
	          nums[f]=nums[i];
	          nums[i]=a;
	          Display.display(nums);
	         break;
     }
        Display.display(nums);
  }
}
private static void reverse(int []nums,int i){
       int begin=i;
       int end=nums.length-1;
       while(begin<end){        
	           int a=nums[begin];
	           nums[begin]=nums[end];
	           nums[end]=a;
	           end--;begin++;
    }
}
  public static void main(String args[]){
	  int nums[]={1,1};
	  nextPermutation(nums);
	  Display.display(nums);
  }
}
