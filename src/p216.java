import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class p216 {
	public static List<List<Integer>> combinationSum3(int k, int n) {
	    List<List<Integer>> re=new LinkedList();
	    recur(re,new LinkedList<Integer> (),n,1,k);
	    return re;
	  }
	public static void recur(List<List<Integer>> re, LinkedList<Integer> tmp,int target, int begin,int k){
		if(target>0&&k>0){
			for(int i=begin;i<=9&&i<=target;i++){
				tmp.add(i);k--;
				recur(re,tmp,target-i,i+1,k);
			
				tmp.remove(tmp.size()-1); 
				k++;
			}
		 }else if(target==0&&k==0){
			re.add(new LinkedList<Integer>(tmp));
		  }
	}
	public static void main(String args[]){
		Display.display(combinationSum3(3,9));
	}
}
