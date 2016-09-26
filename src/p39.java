import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class p39 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> re=new LinkedList();
        recur(re,new LinkedList<Integer>(),candidates,target,0);
        return re;
    }
    public static void recur(List<List<Integer>> re, LinkedList<Integer> tmp, int candidates[],int target, int begin){
    	if(target>0){
    		for(int i=begin;i<candidates.length&&candidates[i]<=target;i++){
    			tmp.add(candidates[i]);
    			recur(re,tmp,candidates,target-candidates[i],i);
    			tmp.remove(tmp.size()-1);
    		}
    	}else if(target==0){
    		re.add(new LinkedList<Integer>(tmp));
    	}
    }
    public static void main(String args[]){
    	int nums[]={2,3,6,7};
    	Display.display(combinationSum(nums,7));
    }
}
