import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class p40 {
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> re=new LinkedList();
    //recur1(re,candidates,target,0);
    recur(re,new LinkedList<Integer>(),candidates,target,0);
    return re;
  }
public static void recur1(List<List<Integer>> re,  int candidates[],int target, int begin){
	for(int i=0;i<candidates.length&&candidates[i]<=target;i++){
		if(i!=0){
		if(candidates[i]!=candidates[i-1]){
			LinkedList<Integer> tmp=new LinkedList();
			tmp.add(candidates[i]);
			recur(re,tmp,candidates,target-candidates[i],i+1);
		  }
		}else{
			   LinkedList<Integer> tmp=new LinkedList();
			   tmp.add(candidates[i]);
		       recur(re,tmp,candidates,target-candidates[i],i+1);
		}
	}
}
public static void recur(List<List<Integer>> re, LinkedList<Integer> tmp, int candidates[],int target, int begin){
	if(target>0){
		for(int i=begin;i<candidates.length&&candidates[i]<=target;i++){
			tmp.add(candidates[i]);
			recur(re,tmp,candidates,target-candidates[i],i+1);
			while(i<candidates.length-1&&candidates[i+1]==candidates[i]){
				i++;
			}
			tmp.remove(tmp.size()-1);
		}
	 }else if(target==0){
		re.add(new LinkedList<Integer>(tmp));
	  }
}
  public static void main(String args[]){
	    int nums[]={10,1,2,7,6,1,5};
	    int nums2[]={2,2,2,2};
	    Display.display(combinationSum2(nums2,4));
   }
}
