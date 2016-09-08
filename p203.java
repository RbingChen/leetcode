
public class p203 {
    public static ListNode removeElements(ListNode head, int val) {
        //if(head.val==val) {head=head.next;return head;}
        if(head==null) return head;
        while(head!=null&&head.val==val){head=head.next;}
    	ListNode lt=head;
    	ListNode lb=lt;
    	while(lt!=null){
    		if(lt.val==val){ 			
    		 lb.next=lt.next;   				
    		}
    		else{
    		  lb=lt;
    		}	
    		lt=lb.next;
    	}
    	return head;
    }
    public static ListNode removeElements2(ListNode head, int val) {
        //if(head.val==val) {head=head.next;return head;}
        
        while(head!=null&&head.val==val){head=head.next;}
        if(head==null) return head;
    	ListNode lt=head;
    	
    	//ListNode lb=lt;
    	while(lt.next!=null){
    		if(lt.next.val==val){ 			
    		
    		  lt.next=lt.next.next;   				
    		}
    		else  lt=lt.next;
    	}
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
      ListNode l1=new ListNode(5);
      ListNode l1_1=new ListNode(5);
      ListNode l1_2=new ListNode(5);
      ListNode l1_3=new ListNode(5);
      ListNode l1_4=new ListNode(6);
      l1.next=l1_1;l1_1.next=l1_2;l1_2.next=l1_3;l1_3.next=l1_4;
      
      display(l1);
     
      display(removeElements2(l1_3,6));
    }
}
