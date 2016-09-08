
public class ListNode {
       public int val;
       private ListNode first;
       public ListNode next;
       private ListNode end;
       
       ListNode(){}
       ListNode(int x){
    	   this.val=x;
       }
       /*
       public void insert(int x){
    	   ListNode l1=new ListNode(x);
    	   if(this.end==null) { this.first=l1; this.end=l1;  return;}
    	   
    	   this.end.next=l1;
    	   this.end=l1;
       }
       
       public void display(){
    	   ListNode temp=this.first;
    	   while(temp!=null){
    		   System.out.print(temp.val+" ");
    		   temp=temp.next;
    	   }
    	   System.out.println();
       }*/
}
