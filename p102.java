import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
public class p102 {
	 public static List<List<Integer>> levelOrder(TreeNode root) {
		 List<List<Integer > > re=new ArrayList();
		 if(root==null) return re;
		 
	        ArrayDeque<TreeNode> record=new ArrayDeque();
	        record.add(root);
	        while(!record.isEmpty()){
	        	ArrayList<Integer> lt=new ArrayList();
	        	ArrayDeque<TreeNode> record2=new ArrayDeque();
	        	while(!record.isEmpty()){
	        		TreeNode kt=record.pop();
	        		lt.add(kt.val);
	        		if(kt.left!=null)
	        			record2.add(kt.left);
	        		if(kt.right!=null)
	        			record2.add(kt.right);		
	        	}
	        	re.add(lt);
	        	for(TreeNode ft: record2){
	        		record.add(ft);
	        	}
	        }
		 return re;
	    }
}
