
public class p142 {
	public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
		ListNode walker = head;
		ListNode runner = head;
		int flag=0;
		while(runner.next!=null && runner.next.next!=null) {
			walker = walker.next;
			runner = runner.next.next;
			if(walker==runner) {flag=1;break;}
		}
		if(flag==0) return null;
		walker=head;
		if(flag==1){
		    while(walker!=runner){
		        walker=walker.next;
		        runner=runner.next;
		    }
		}
		return walker;
    }
}
