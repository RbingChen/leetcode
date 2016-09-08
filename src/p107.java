import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p107 {
	
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> res=new ArrayList<>();
    	dfs(root,0,res);
        List<List<Integer>> re=new ArrayList<>();
        for(int i=0;i<res.size();i++){
        	re.add(res.get(res.size()-1-i));
        }
    	return null;
    }
    
    public void dfs(TreeNode node,int level,List<List<Integer>> res){
    	if(node==null) return;
    	if(level==res.size()){
    		res.add(new ArrayList<Integer>());
    	}
    	 res.get(level).add(node.val);
    	dfs(node.left,level+1,res);
    	dfs(node.right,level+1,res);
    }
}
