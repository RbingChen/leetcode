import java.util.ArrayList;
import java.util.List;

public class p103 {
   public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res=new ArrayList<>();
        sup(root,0,res);
       boolean i=false;
        for(List<Integer> lt : res){
        
         if(i){
        	int mid=lt.size()/2;
        	int end=lt.size()-1;
        	for(int it=0;it!=end-it;it++){
        		int a=lt.get(it);
        		lt.set(it,lt.get(end-it));
        		lt.set(end-it,a);
        	}
        	}
         i=!i;
        }
        return res;
    }
   
   public static void sup(TreeNode node,int level,List<List<Integer>> res){
	   if(node==null) return;
	   if(level==res.size()){
		   res.add(res.size(),new ArrayList());
	   }
	   res.get(level).add(node.val);
	   sup(node.left,level+1,res);
	   sup(node.right,level+1,res);	   	   
   }
   /**********************************************************************/
   public static List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
	   List<List<Integer>> res=new ArrayList<>();
       sup2(root,0,res);
       return res;
   }
   public static void sup2(TreeNode node,int level,List<List<Integer>> res){
	   if(node==null) return;
	   if(level==res.size()){
		   res.add(res.size(),new ArrayList());
	   }
	   if(level%2==0){
		   res.get(level).add(node.val);
	   }else{
		   res.get(level).add(0,node.val);
	   }
	   sup(node.left,level+1,res);
	   sup(node.right,level+1,res);	   
   }
   public static void main(String args[]){
	   System.out.println(1^0);
	   System.out.println(1);
   }
}
