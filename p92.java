
public class p92 {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) return head;
    	int count=0;
    	ListNode lt=head;
    	ListNode pre_head=new ListNode(-1);
    	pre_head.next=head;
        ListNode pre_begin=null;
        
        ListNode begin=null,end=null;
        if(m==1){
        	pre_begin=pre_head;
        	while(count!=n){
            	  count++;
            	if(count==n)
            	  end=lt;
               lt=lt.next;
               
            }
        }else{
        	while(count!=n){
          	  count++;
          	if(count==m-1)
          	   pre_begin=lt;
          	if(count==n)
          	   end=lt;
          	lt=lt.next;
           }
        }
        
        begin=pre_begin.next;
        
        ListNode end_next=end.next;
        ListNode s1=begin;
        ListNode s3=null;
            /*在执行的过程中end.next变化了，所以不能使用end.next;*/
        while(s1!=end_next){
           ListNode s2=s1.next;
           s1.next=s3;
           s3=s1;
           s1=s2;
          }
        pre_begin.next=end;
        begin.next=end_next;
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
        ListNode l1_6=new ListNode(1);
        ListNode l1_7=new ListNode(79);
        l1.next=l1_1;l1_1.next=l1_2;l1_2.next=l1_3;
        l1_3.next=l1_4;l1_4.next=l1_5;l1_5.next=l1_6;
        l1_6.next=l1_7;//l1_7.next=l1_8;
        display(l1);
        display(reverseBetween(l1,1,8)); 
      } 
}
