
public class p234 {
	 public static boolean isPalindrome(ListNode head) {
	       int len=0;
	       int mid;
	       ListNode lt=head;
	       ListNode midNode;
	       
	       while(lt!=null){len++;lt=lt.next;}
	       if(len==2) return head.val==head.next.val;
	       if(len==1||len==0) return true;
	       ListNode leftNode=null;
	       ListNode rightNode=null;
	       if(len%2==0) {
	    	   mid=len/2;
		       len=0; 
		       lt=head;
		       while(lt!=null){
		    	   len++;
		    	   if(len==mid) break;
		    	   lt=lt.next;
		       } 
		       midNode=lt.next;
		       lt.next=reverseList2(lt.next);
		        leftNode=head;
	    	    rightNode=lt.next; 
	    	 //  display(head);
		       while(leftNode!=lt.next&&rightNode!=null){
		    	    if(leftNode.val!=rightNode.val) return false;
		    	    else{leftNode=leftNode.next;rightNode=rightNode.next;}
		       }
		       if(leftNode==lt.next&&rightNode==null) return true;
	       }
	       else {
	    	   mid=len/2+1;
	    	   len=0; 
		       lt=head;
		       while(lt!=null){
		    	   len++;
		    	   if(len==mid) break;
		    	   lt=lt.next;
		       } 
		       lt.next=reverseList2(lt.next);
		       leftNode=head;
	    	   rightNode=lt.next;
	    	//   display(head);
	    	//   System.out.println(lt.val+" ");
		       while(leftNode!=lt&&rightNode!=null){
		    	    if(leftNode.val!=rightNode.val) return false;
		    	    else{leftNode=leftNode.next;rightNode=rightNode.next;}
		    	 }
		       if(leftNode==lt&&rightNode==null) return true;
	       }
	       
	       return false;
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
	 public static boolean isPalindrome2(ListNode head) {
	       int len=0;
	       int mid;
	       ListNode lt=head;
	       ListNode midNode;
	       
	       while(lt!=null){len++;lt=lt.next;}
	       if(len==2) return head.val==head.next.val;
	       if(len==1||len==0) return true;
	       ListNode leftNode=null;
	       ListNode rightNode=null;
	       if(len%2==0) {
	    	   mid=len/2;   
	       }
	       else {
	    	   mid=len/2+1;		   
	       }
	       len=0; 
	       lt=head;
	       while(lt!=null){
	    	   len++;
	    	   if(len==mid) break;
	    	   lt=lt.next;
	       } 
	       
	       lt.next=reverseList2(lt.next);
	       
	       leftNode=head;
	       rightNode=lt.next;
	       while(rightNode!=null){
	    	    if(leftNode.val!=rightNode.val) return false;
	    	    else{leftNode=leftNode.next;rightNode=rightNode.next;}
	       }
	    
	       return true;
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
       ListNode l1_2=new ListNode(2);
       ListNode l1_3=new ListNode(1);
       l1.next=l1_1;l1_1.next=l1_2;l1_2.next=l1_3;
       display(l1);
       System.out.println(isPalindrome2(l1));
       
       ListNode l2=new ListNode(1);
       ListNode l2_1=new ListNode(2);
       ListNode l2_2=new ListNode(0);
       ListNode l2_3=new ListNode(2);
       ListNode l2_4=new ListNode(1);
       l2.next=l2_1;l2_1.next=l2_2;l2_2.next=l2_3;l2_3.next=l2_4;
       display(l2);
       System.out.println(isPalindrome2(l2));
     }
}
