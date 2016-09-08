import java.util.ArrayList;
import java.util.Arrays;

public class p350 {
    public static int[] intersection(int[] nums1, int[] nums2) {
   	Arrays.sort(nums1);
   	Arrays.sort(nums2);
   	ArrayList<Integer> lt=new ArrayList();
   	//display(nums1);
   	//display(nums2);
   	int s1=nums1.length;int s2=nums2.length;
   	int i=0,j=0;
        while(i<s1&&j<s2){
   			if(nums2[j]>nums1[i]){
   				while(i<s1&&nums2[j]>nums1[i]) i++;
   			}
   			else if(nums2[j]==nums1[i]){
   				lt.add(nums2[j]);
   				i++;j++;
   			}else{
   				while(j<s2&&nums2[j]<nums1[i]) j++;
   			}
   			//System.out.println(i+" "+j);
   		}
      int re[]=new int[lt.size()];
      for(int k=0;k<lt.size();k++)
   	   re[k]=lt.get(k);
      return re;
   }
   public static void display(int nums[]){
   	for(int k=0;k<nums.length;k++)
   		System.out.print(nums[k]+" ");
   	System.out.println();
   }
   public static void main(String args[ ]){
   	int nums1[]={1,2,2,1,3,4,5,5,67,7,8};
   	int nums2[]={2,2,4,5,5,6,6,3,2};
   	int nums3[]={1};
   	int nums4[]={2};
   	display(intersection(nums1,nums2));
   	display(intersection(nums3,nums4));
   }
}
