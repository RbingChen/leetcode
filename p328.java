/*
 * 看清楚题目，我擦，很简单的题，奇数偶数间隔
 * 
 */
public class p328 {
	/*这个方法可以解决不是间隔的问题，但是得到的结果是无序的*/
    public static ListNode oddEvenList(ListNode head) {
    	if(head==null||head.next==null) return head;
    	ListNode lt=head;
    	ListNode kt=new ListNode(-1);
    	kt.next=head;
    	ListNode pre_i=kt;
    	ListNode pre_lt=kt;
    	while(lt!=null){
    		if(lt.val%2==1){
    			if(pre_i.next!=lt&&pre_i.next!=pre_lt){
    				ListNode lt_next=lt.next;
    				ListNode pre_next=pre_i.next;
    				ListNode pre_next_next=pre_i.next.next;
    				
    				pre_i.next=lt;
    				lt.next=pre_next_next;
    				pre_lt.next=pre_next;
    				pre_next.next=lt_next;
    				
    				pre_i=pre_i.next;
    				
    				lt=lt_next;
    				
    				pre_lt=pre_lt.next;
    				
    			}else if(pre_i.next!=lt&&pre_i.next==pre_lt){
    				pre_i.next=lt;
    				pre_lt.next=lt.next;
    				lt.next=pre_lt;
    				
    				pre_i=pre_i.next;
    				lt=pre_lt.next;
    				
    			}
    			else{
        			pre_lt=lt;
        			lt=lt.next;
        			pre_i=pre_i.next;
        		  }
    		}
    		else{
    			pre_lt=lt;
    			lt=lt.next;
    		}  
    	}
        return kt.next;
    }
    /*符合题目要求的  牛人的解法*/
    public static ListNode oddEvenList2(ListNode head) {
    	 if (head != null) {
    		    
    	        ListNode odd = head, even = head.next, evenHead = even; 
    	    
    	        while (even != null && even.next != null) {
    	            odd.next = odd.next.next; 
    	            even.next = even.next.next; 
    	            odd = odd.next;
    	            even = even.next;
    	        }
    	        odd.next = evenHead; 
    	    }
    	    return head;

    }
    /*另一种简单解法，计数解法*/
    public static ListNode oddEvenList3(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode oddHead=head,oddindex=head;
        ListNode evenHead=head.next,evenindex=head.next;
        
        ListNode lt=evenHead.next;
        
        evenindex.next=null;
        oddindex.next=null;
        
        int count=1;
        while(lt!=null){
        	if(count%2==1){
        		oddindex.next=lt;
        		lt=lt.next;
        		oddindex.next.next=null;
        		oddindex=oddindex.next;
        	}else{
        		evenindex.next=lt;
        		lt=lt.next;
        		evenindex.next.next=null;
        		evenindex=evenindex.next;
        		
        	}
        	count++;
        }
        oddindex.next=evenHead;
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
        ListNode l1_1=new ListNode(2);
        ListNode l1_2=new ListNode(3);
        ListNode l1_3=new ListNode(4);
        ListNode l1_4=new ListNode(5);
        ListNode l1_5=new ListNode(6);
        ListNode l1_6=new ListNode(7);
        ListNode l1_7=new ListNode(8);
        l1.next=l1_1;l1_1.next=l1_2;//l1_2.next=l1_3;
        l1_3.next=l1_4;l1_4.next=l1_5;l1_5.next=l1_6;
        l1_6.next=l1_7;//l1_7.next=l1_8;
        display(l1);
        display(oddEvenList3(l1));
        
      }
}
