
public class p226 {
	 public TreeNode invertTree(TreeNode root) {
	       invert(root.left,root.right);
		 return null;
	    }
	 private void invert(TreeNode lt,TreeNode rt){
		 if(lt==null&&rt==null) return;
		 else if(lt==null&&rt!=null){
			
		 }
		 else{
			 int a=lt.val;
			 lt.val=rt.val;
			 rt.val=a;
			 invert(lt.left,rt.right);
			 invert(lt.right,rt.left);
		 }
	 }
}
