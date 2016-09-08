public class p147 {
    public static ListNode insertionSortList(ListNode head) {
    	if(head==null||head.next==null) return head;	
    	ListNode lt=head;
    	ListNode pre_head=new ListNode(-1);
    	pre_head.next=head;
    	ListNode do_next;
    	ListNode move,pre_move;
    	ListNode pre_lt=pre_head;
    	while(lt!=null){
    		move=pre_head.next;
    		pre_move=pre_head;
    		do_next=lt.next;
    		while(move!=lt){
    			if(move.val>lt.val){
    					pre_move.next=lt;
    					pre_lt.next=do_next;
    				    lt.next=move;
    				    break;
    			}
    			else{
    				  pre_move=move;
    			      move=move.next;
    			}
    			
    		}
    		if(lt==move) {pre_lt=lt;lt=do_next;}
    		else lt=do_next;
    		
    	}
        return pre_head.next;
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
       ListNode l1=new ListNode(9);
       ListNode l1_1=new ListNode(3);
       ListNode l1_2=new ListNode(2);
       ListNode l1_3=new ListNode(4);
       ListNode l1_4=new ListNode(7);
       ListNode l1_5=new ListNode(6);
       ListNode l1_6=new ListNode(8);
       ListNode l1_7=new ListNode(5);
       l1.next=l1_1;//l1_1.next=l1_2;l1_2.next=l1_3;
       l1_3.next=l1_4;l1_4.next=l1_5;l1_5.next=l1_6;
       l1_6.next=l1_7;//l1_7.next=l1_8;
       display(l1);
       display(insertionSortList(l1));
       
     }
}
