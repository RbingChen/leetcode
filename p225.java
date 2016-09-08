import java.util.ArrayDeque;
import java.util.Queue;

public class p225 {
	ArrayDeque<Integer> mystack =new ArrayDeque();
   public void push(int x) {
	    int count=mystack.size();
	    mystack.push(x);
	    int i=0;
	    while(i<count){
	    	mystack.push(mystack.pop());
	    	i++;
	    }
    }

    // Removes the element on top of the stack.
    public void pop() {
        mystack.pop();
    }

    // Get the top element.
    public int top() {
        return mystack.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return mystack.isEmpty();
    }
    public static void main(String args[]){
    	p225 t=new p225();
    	t.push(1); t.push(2);t.push(3);
    	System.out.println(t.top());t.pop();
    	System.out.println(t.top());t.pop();
    	System.out.println(t.top());t.pop();
    	
    }
}
