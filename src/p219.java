import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class p219 {
	 public boolean containsNearbyDuplicate(int[] nums, int k) {
	        
	        for(int i=0;i<nums.length;i++){
	            for(int j=1;j<=k&&j+i<nums.length;j++){
	                if(nums[i]==nums[i+j])
	                     return true;
	            }
	        }
	        return false;
	    }
	 
	 public boolean containsNearbyDuplicate2(int[] nums, int k) {
	        Map<Integer,Integer> res=new HashMap();
	        for(int i=0;i<nums.length;i++){
	           if(res.containsKey(nums[i])){
	        	   if(i-res.get(nums[i])<=k) return true;
	        	   else res.put(nums[i], i);
	        	   }
	           else{
	        	   res.put(nums[i], i);
	           }
	           
	        }
	        return false;
	    }
	 
	 public boolean containsNearbyDuplicate3(int[] nums, int k) {
	        Set<Integer> set = new HashSet<Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(i > k) set.remove(nums[i-k-1]);
	            if(!set.add(nums[i])) return true;
	        }
	        return false;
	 }
}
