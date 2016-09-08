
public class p206 {
    public static ListNode reverseList(ListNode head) {
    	if(head==null||head.next==null) return head;
    	ListNode mid_next=head.next.next;
    	ListNode mid=head.next;
    	head.next=null;
    	while(mid!=null){
    		mid.next=head;
    		head=mid;
    		if(mid_next==null) break;
    		mid=mid_next;
    		mid_next=mid.next;
    	}
        return head;
    }
    public static ListNode reverseList2(ListNode head) {
    	ListNode newHead=null;
    	while(head!=null){
    		ListNode nextdo=head.next;
    		head.next=newHead;
    		newHead=head;
    		head=nextdo;
    	}
    	return newHead;
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
      ListNode l1=new ListNode(0);
      ListNode l1_1=new ListNode(2);
      ListNode l1_2=new ListNode(5);
      ListNode l1_3=new ListNode(8);
      l1.next=l1_1;l1_1.next=l1_2;l1_2.next=l1_3;
     
      display(l1);
      display(reverseList2(l1));
    }
}
