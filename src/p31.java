/*
 * �������֣��ҵ���һ������ԣ�i-1,i��....(4,5)
 * (i-1) ����i-nums.length-1 �������
 * i���������ת��Ϊ��ʹ���ڵ�ǰ����µ��������ࣿ����
 * 
 * [7,2,5,4,3,1]�ҵ�[2,5],��ʱ,�ҵ��δ���2��ֵ����num.length-1��ʼ���ң���Ȼ�ǵ�һ������2��������
 * ����[7,3,5,4,2,1],�������ת������ת��
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
