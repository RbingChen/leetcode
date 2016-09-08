import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p18 {
      public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList();
        if(nums.length<4) return res;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
        	if(i==0||(i>0&&(nums[i]!=nums[i-1]))){
        		for(int j=i+1;j<nums.length-2;j++){
        			if(j-i==1||((j-i)>1&&(nums[j]!=nums[j-1]))){
        				int sum=target-nums[i]-nums[j];
        				int left=j+1;
        				int right=nums.length-1;
        				
        				while(left<right){
        					if(sum==nums[left]+nums[right]) {
        						res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
        						while(left<right&&nums[left]==nums[left+1]) left++;
        						while(left<right&&nums[right]==nums[right-1]) right--;
        						left++;right--;
        					}
        					else if(sum<nums[left]+nums[right]){
        						right--;	
        					}
        					else left++;
        					//System.out.println(left+" "+right);
        				}
        			}
        		}
        	}
        }
        return res;
    }
  /*
   *递归的思想 
   * 使用Arrays.asList()后调用add，remove这些method时出现java.lang.UnsupportedOperationException异常。
   * 这是由于Arrays.asList() 返回java.util.Arrays$ArrayList， 而不是ArrayList。Arrays$ArrayList和ArrayList
   * 都是继承AbstractList，remove，add等method在AbstractList中是默认throw UnsupportedOperationException
   * 而且不作任何操作。ArrayList override这些method来对list进行操作，
   * 但是Arrays$ArrayList没有override remove()，add()等，所以throw UnsupportedOperationException。
   */
      public static List<List<Integer>> fourSum_cur(int[] nums, int target) {
          List<List<Integer>> re=new ArrayList();
          if(nums.length<4) return re;
          Arrays.sort(nums);
          re=kSums(nums,target,4,0);
          return re;
          }
      public static List<List<Integer>> kSums(int [] nums,int target,int k,int begin){
    	  List<List<Integer>> res=new ArrayList();
    	 // System.out.println(k);
    	  if(begin>nums.length) {
              return res;
          }
    	  if(k==2){
    		  int i=begin;
    		  int j=nums.length-1;
    		  /*while(i < j) {
          	    if(target - nums[i] == nums[j]) {
          	    	List<Integer> temp = new ArrayList<>();
                  	temp.add(nums[i]);
                  	temp.add(target-nums[i]);
                      res.add(temp);
                      while(i<j && nums[i]==nums[i+1]) i++;
                      while(i<j && nums[j-1]==nums[j]) j--;
                      i++;
                      j--;
          	    } else if (target - nums[i] > nums[j]) {
          	        i++;
          	    } else {
          	        j--;
          	    }*/
    		  while(i<j){
    			  if(target==(nums[i]+nums[j])){
    				  List<Integer> tt=new ArrayList();
    				  tt.add(nums[i]);
    				  tt.add(nums[j]);
    				  res.add(tt);
    				  while(i<j&&nums[i]==nums[i+1]) i++;
    				  while(i<j&&nums[j]==nums[j-1]) j--;
    				  i++;
    				  j--;
    			  }else if(target<(nums[i]+nums[j])) {j--;}
    			  else i++;
    		  }
    	  }
    	  else{
    		  for(int f=begin;f<nums.length-k+1;f++){
    		      List<List<Integer>> temp=kSums(nums,target-nums[f],k-1,f+1);
    		      if(temp!=null){
    		    	  for(List<Integer> t : temp){
    		    		  t.add(0,nums[f]);
    		    	  }
    		    	  res.addAll(temp);
    		      }
    		      while(f<nums.length-1&&nums[f]==nums[f+1]) {
    		    	    System.out.println(nums[f]);f++;
    		    	  }
    		 }
    	  }
    	  return res;
      }
 /*
 * 
 * 
 * 
 * */
     static  int len = 0;
      public static List<List<Integer>> fourSum2(int[] nums, int target) {
          len = nums.length;
          Arrays.sort(nums);
          return kSum(nums, target, 4, 0);
      }
     private static ArrayList<List<Integer>> kSum(int[] nums, int target, int k, int index) {
          ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
          if(index >= len) {
              return res;
          }
          if(k == 2) {
          	int i = index, j = len - 1;
          	while(i < j) {
          	    if(target - nums[i] == nums[j]) {
          	    	List<Integer> temp = new ArrayList<>();
                  	temp.add(nums[i]);
                  	temp.add(target-nums[i]);
                      res.add(temp);
                      while(i<j && nums[i]==nums[i+1]) i++;
                      while(i<j && nums[j-1]==nums[j]) j--;
                      i++;
                      j--;
          	    } else if (target - nums[i] > nums[j]) {
          	        i++;
          	    } else {
          	        j--;
          	    }
          	}
          } else{
              for (int i = index; i < len - k + 1; i++) {
                  ArrayList<List<Integer>> temp = kSum(nums, target - nums[i], k-1, i+1);
                  if(temp != null){
                      for (List<Integer> t : temp) {
                          t.add(0, nums[i]);
                      }
                      res.addAll(temp);
                  }
                  while (i < len-1 && nums[i] == nums[i+1]) {
                      i++;
                  }
              }
          }
          return res;
      }
    public static void display(List<List<Integer>> lt){
      if(lt==null) return;
   	   for(int i=0;i<lt.size();i++)
   	   {
   		 for(int j=0;j<lt.get(i).size();j++)
   		 {
   			 System.out.print(lt.get(i).get(j)+"  ");
   		 }
   		 System.out.println();
   	  }
    }
      public static void main(String args[]){
    	  int s[]={-1,0,1,2,-1,};
    	  int s1[]={0,0,0,-1,0,0};
    	  display(fourSum_cur(s,-1));
    	  System.out.println("/**************************/");
    	  display(fourSum2(s,-1));
      }
}
