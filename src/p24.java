
public class p24 {
    public static ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
    	ListNode lt=head;
    	ListNode pre=new ListNode(-1);
    	pre.next=head;
        ListNode newhead=pre;
    	ListNode lt_next;
    	while(lt!=null&&lt.next!=null){
    		pre.next=lt.next;
    		lt_next=lt.next.next;
    		
    		lt.next.next=lt;
    		lt.next=lt_next;
    		pre=lt;
    		lt=lt_next;
    	}
    	
    	return newhead.next;
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
         ListNode l1=new ListNode(3);
         ListNode l1_1=new ListNode(4);
         ListNode l1_2=new ListNode(2);
         ListNode l1_3=new ListNode(1);
         l1.next=l1_1;l1_1.next=l1_2;l1_2.next=l1_3;
         display(l1);
         display(swapPairs(l1_1));
         
       }
}
