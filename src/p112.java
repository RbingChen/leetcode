
public class p112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        return compu(root,sum);
    }
    public boolean compu(TreeNode node,int sum){
    	if(sum-node.val==0){
    		if(node.left==null&&node.right==null) return true;
    		else return false;
    	}else{
    		if(node.left!=null&&node.right!=null)
    			return compu(node.left, sum-node.val)||compu(node.right,sum-node.val);
    		else if(node.left!=null&&node.right==null){
    			return compu(node.left, sum-node.val);
    		}else if(node.left==null&&node.right!=null){
    			return compu(node.right,sum-node.val);
    		}else{
    			return false;
    		}
    	}  		
     }
    
    public boolean hasPathSu2(TreeNode root, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null && sum - root.val == 0) return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
