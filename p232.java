import java.util.Stack;

public class p232 {
   Stack<Integer> queue = new Stack();
   public void push(int x) {
        Stack<Integer> temp=new Stack();
        while(!queue.isEmpty()){
        	temp.push(queue.pop());
        }
        queue.push(x);
        while(!temp.isEmpty()){
        	queue.push(temp.pop());
        }
     }

    // Removes the element from in front of queue.
     public void pop() {
         queue.pop();
     }

    // Get the front element.
    public int peek() {
        return queue.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
 
    public static void main(String args[]){
    	p232 t=new p232();
    	t.push(1);t.push(2);t.push(3);
    	System.out.println(t.peek());
    }
    
}
