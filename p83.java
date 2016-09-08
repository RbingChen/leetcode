
public class p83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
    	ListNode lt=head;
    	while(lt!=null&&lt.next!=null){
    		if(lt.next.val==lt.val){
    			lt.next=lt.next.next;
    		}else{
    			lt=lt.next;
    		}
    	}
    	//display(head);
    	return head;
    }
    public static void display(ListNode lt){
   	 ListNode t=lt;
   	 while(t!=null){
   		 System.out.print(t.val+" ");
   		 t=t.next;
   	 }
   	 System.out.println();
    }
    public static void main( String args[]){
      ListNode l1=new ListNode(1);
      ListNode l1_1=new ListNode(1);
      ListNode l1_2=new ListNode(1);
      ListNode l1_3=new ListNode(1);
      l1.next=l1_1;l1_1.next=l1_2;l1_2.next=l1_3;
      display(l1);
      display(deleteDuplicates(l1));
    }
 }
