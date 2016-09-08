
public class p86 {
   public static ListNode partition(ListNode head, int x) {
	    if(head==null||head.next==null) return head;
	    
	    ListNode lessHead=new ListNode(-1);
	    ListNode biggerHead=new ListNode(-1);
	    ListNode head1 = null,head2=null;
	    lessHead.next=null;
	    biggerHead.next=null;
	    ListNode lt=head;
	    while(lt!=null){
	    	if(lt.val<x){
	    		
	    		  if(lessHead.next==null)
	    			{
	    			lessHead.next=lt;
	    			lt=lt.next;
	    			head1=lessHead.next;
	    			head1.next=null;
	    			}
	    	 
	    		else{
	    			head1.next=lt;
	    			lt=lt.next;
	    			head1=head1.next;
	    			head1.next=null;
	    		}
	    	}else{
	    		if(biggerHead.next==null){
	    			biggerHead.next=lt;
	    			lt=lt.next;
	    			head2=biggerHead.next;
	    			head2.next=null;
	    		}
	    		else{
	    			head2.next=lt;
	    			lt=lt.next;
	    			head2=head2.next;
	    			head2.next=null;
	    	}		
	     }
      }
	   if(biggerHead.next==null) return lessHead.next;
	   else if(lessHead.next==null) return biggerHead.next;
	   else head1.next=biggerHead.next;
        return lessHead.next;
   }
   
   public static ListNode partition2(ListNode head, int x) {
	    if(head==null||head.next==null) return head;
	    
	    ListNode lessHead=new ListNode(-1);
	    ListNode biggerHead=new ListNode(-1);
	    ListNode head1 = lessHead,head2=biggerHead;
	    lessHead.next=null;
	    biggerHead.next=null;
	    ListNode lt=head;
	    while(lt!=null){
	    	if(lt.val<x){
	    		
	    
	    			head1.next=lt;
	    			lt=lt.next;
	    			head1=head1.next;
	    			head1.next=null;
	    		
	    	}else{
	    		
	    			head2.next=lt;
	    			lt=lt.next;
	    			head2=head2.next;
	    			head2.next=null;	
	     }
     }
	   if(biggerHead.next==null) return lessHead.next;
	   else if(lessHead.next==null) return biggerHead.next;
	   else head1.next=biggerHead.next;
       return lessHead.next;
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
     ListNode l1_6=new ListNode(1);
     ListNode l1_7=new ListNode(1);
     l1.next=l1_1;l1_1.next=l1_2;l1_2.next=l1_3;
     l1_3.next=l1_4;l1_4.next=l1_5;l1_5.next=l1_6;
     l1_6.next=l1_7;//l1_7.next=l1_8;
     display(l1);
     display(partition(l1,6)); 
   }
}
  
