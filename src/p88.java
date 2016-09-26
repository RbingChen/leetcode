
public class p88 {
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int s1=0;
	        int s2=0;
	        int f=0;
	        int nums3[]=new int[m+n];
	        while(s2<n&&s1<m){
	        	if(nums1[s1]<nums2[s2]){
	        		nums3[f]=nums1[s1];s1++;
	        	}else{
	        		nums3[f]=nums2[s2];s2++;
	        	}
	        	f++;
	        }
	        Display.display(nums3);
	        for(int t=s1;t<m;t++){
	        	nums3[f++]=nums1[t];
	        }
	        for(int t=s2;t<n;t++){
	        	nums3[f++]=nums2[t];
	        }
	        Display.display(nums3);
	        for(int i=0;i<m+n;i++){
	        	nums1[i]=nums3[i];
	        }
	        Display.display(nums1);
	 }
	 public static void merge2(int[] nums1, int m, int[] nums2, int n){
		 int s1=m-1;int s2=n-1;
		 int k=m+n-1;
		 while(s1>-1&&s2>-1){nums1[k--]=(nums1[s1]>nums2[s2]) ? nums1[s1--]:nums2[s2--];}
		 while(s2>-1) nums1[k--]=nums2[s2--];
	 }
	 
	 public static void main(String args[]){
		 int nums1[]={1,2,3,0,0,0};
		 int nums2[]={2,5,6};
		 merge(nums1,3,nums2,3);
	 }
	 
}
