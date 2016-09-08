import java.util.LinkedList;
public class p21 {
     public static ListNode mergeTwoList(ListNode l1,ListNode l2){
    	 if(l1==null) return l2;
    	 if(l2==null) return l1;
    	 ListNode l1_head=l1,l2_head=l2;
    	 ListNode re = null,end=null;
    	 while(l1_head!=null&&l2_head!=null){
    		// display(re);
    		 if(l1_head.val<l2_head.val){
    			 if(re==null){ re=l1_head;end=l1_head;}
    			 else {end.next=l1_head;end=l1_head;}
    			 l1_head=l1_head.next;
    		 }else{
    			 if(re==null){ re=l2_head;end=l2_head;}
    			 else {end.next=l2_head;end=l2_head;}
    			 l2_head=l2_head.next;
    		 }
    	 }
    	 if(l1_head==null){while(l2_head!=null){end.next=l2_head;end=l2_head; l2_head=l2_head.next;}}
    	 if(l2_head==null){while(l1_head!=null){end.next=l1_head;end=l1_head; l1_head=l1_head.next;}}
    	 return re;
     }
     public static ListNode mergeTwoList2(ListNode l1,ListNode l2){
    	 if(l1==null) return l2;
    	 if(l2==null) return l1;
    	 
    	 ListNode re = new ListNode(0);
    	 ListNode head=re;
    	 while(l1!=null&&l2!=null){
    		 if(l1.val<l2.val){
    			 re.next=l1;l1=l1.next;
    		 }else{
    			 re.next=l2;l2=l2.next;
    		 }
    		 re=re.next;
    	 }
    	 re.next=(l1!=null)?l1:l2;
    	 //display(head);
    	 return head.next;
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
       
       ListNode l2=new ListNode(1);
       ListNode l2_1=new ListNode(1);
       ListNode l2_2=new ListNode(3);
       ListNode l2_3=new ListNode(7);
       l2.next=l2_1;l2_1.next=l2_2;l2_2.next=l2_3;
       display(l1);
       display(l2);
       display(mergeTwoList2(l1,l2));
     }
}
