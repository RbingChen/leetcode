import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * 考虑连续值的情况。
 * if(j-i>=2&nums[j]==nums[j-1]){
    			 	  continue;
    		      }
    这步骤很重要
 */
public class p15 {
      public static List<List<Integer>> threeSum(int[] nums) {
    	  List<List<Integer>> lt=new ArrayList();
    	  if(nums.length<3) return lt; 
    	  Arrays.sort(nums);
    	  if(nums[nums.length-1]<0) return lt;
    	  
    	  for(int i=0;i<nums.length-2;i++) {
    		  if(i>0){
    			  if(nums[i]==nums[i-1])
    				  continue;
    		  }
    		  for(int j=i+1;j<nums.length-1;j++)
    		  {   
    			  if(j-i>=2&nums[j]==nums[j-1]){
    			 	  continue;
    		      }
    		     else{  
    			    if((nums[i]+nums[j])<=0){  
    				  int findc=0-(nums[i]+nums[j]);
    				  for(int k=nums.length-1;k>j;k--){
    					  //System.out.println(k+" "+nums.length);
    					  if(findc==nums[k])
    					  {   //System.out.println("hehe");
    						  //System.out.println(i+" "+j+" "+k);
    						  List<Integer> temL=new ArrayList();
    						  temL.add(nums[i]);
    						  temL.add(nums[j]);
    						  temL.add(nums[k]);
    						  lt.add(temL);
    						  k=nums.length;
    					  }
    				  }
    			  }
    			  else j=nums.length;
    		    }
    		 }
    	}
        return lt;
    }
  public static List<List<Integer>> NB2threeSum(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      if(nums.length < 3|nums[nums.length-1]>0) return result;
      Arrays.sort(nums);
	  for(int i=0;i<nums.length-2;i++){
		  if(nums[i]>0) return result;
		  if(i>=2){while(nums[i]==nums[i-2]&i<nums.length-2) {i++;}}
		  int j=i+1;
		  int k=nums.length-1;
		  while(j<k){
			  int sum=nums[i]+nums[j]+nums[k];
			  if(sum==0){
				  result.add(Arrays.asList(nums[i], nums[j], nums[k]));
				  //System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
				  System.out.println(i+" "+j+" "+k);
				  while(nums[j]==nums[j+1]&j<k) j++;
				  while(nums[k]==nums[k-1]&j<k) k--;
			  }
			  if(sum<0) j++;
			  if(sum>0) k--;
		  }
		  
	  }
      return result;   
  }
  /*
   *牛人的解法 
   */
  //没有规律可循的   
   public static List<List<Integer>> NBthreeSum(int[] nums) {
          List<List<Integer>> result = new ArrayList<>();
          if(nums.length < 3) return result;
          Arrays.sort(nums);
          int i = 0;
          while(i < nums.length - 2) {
              if(nums[i] > 0) break;
              int j = i + 1;
              int k = nums.length - 1;
              while(j < k) {
                  int sum = nums[i] + nums[j] + nums[k];
                  if(sum == 0) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                  if(sum <= 0) while(nums[j] == nums[++j] && j < k);
                  if(sum >= 0) while(nums[k--] == nums[k] && j < k);
              }
              while(nums[i] == nums[++i] && i < nums.length - 2);
          }
          return result;
      }
   //此方法可取
   public static List<List<Integer>> NNBthreeSum(int[] num) {
	    Arrays.sort(num);
	    List<List<Integer>> res = new LinkedList<>(); 
	    for (int i = 0; i < num.length-2; i++) {
	        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
	            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
	            while (lo < hi) {
	                if (num[lo] + num[hi] == sum) {
	                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
	                    while (lo < hi && num[lo] == num[lo+1]) lo++;
	                    while (lo < hi && num[hi] == num[hi-1]) hi--;
	                    lo++; hi--;
	                } else if (num[lo] + num[hi] < sum) lo++;
	                else hi--;
	           }
	        }
	    }
	    return res;
	}
     public static void main(String args[]){
    	 int s[]={-1, 0, 1, 2,-1, -4};
    	//int s[]={0,0,0,0,0};
    	 List<List<Integer>> lt=NNBthreeSum(s);
    	 for(int i=0;i<lt.size();i++)
    	 {
    		 for(int j=0;j<lt.get(i).size();j++)
    		 {
    			 System.out.print(lt.get(i).get(j)+"  ");
    		 }
    		 System.out.println();
    	 }
    	 for(int i=0;i<s.length;i++)
    		 System.out.print(s[i]+" ");
     }
     
}
