/*
 * *Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the 
shortest path from the root node down to the nearest 
leaf node
 */
public class p111 {
	 public int minDepth(TreeNode root) {
         
		    if(root==null) return 0;
		    if(root.left==null&&root.right==null) return 1;
         else if(root.left==null&&root.right!=null){
         	
         	return minDepth(root.right)+1;
         }else if(root.right==null&&root.left!=null){
         	
         	return minDepth(root.left)+1;
         }
         else{
         	int a=minDepth(root.left)+1;
         	int b=minDepth(root.right)+1;
         	return a>b ? b:a;
         } 
	    }
	    public int getDepth(TreeNode node){
	         return minDepth(node);
		    }
	    
	 public int minDepth2(TreeNode root) {
		    if(root == null) return 0;
		    if(root.left == null || root.right == null) 
		    return 1 + Math.max(minDepth(root.left), minDepth(root.right));
		    return 1 + Math.min(minDepth(root.left), minDepth(root.right));
		}

}
