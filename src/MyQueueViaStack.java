import java.util.Stack;

public class MyQueueViaStack<E> {
	
	Stack<E>stackEnqueue;
	Stack<E>stackDequeue;
	
	public MyQueueViaStack() {
		
		stackEnqueue = new Stack<>();
		stackDequeue = new Stack<>();
	}
	
	public void enqueue(E e) {
		stackEnqueue.push(e);
	}
	
	public E dequeue() {
		reverseStackEnqueue();
		return stackDequeue.pop();
		
	}
	
	public E peek() {
		reverseStackEnqueue();
		return stackDequeue.pop();
		
	}
	
	public int size() {
		return stackEnqueue.size() + stackDequeue.size();
		
	}

	private void reverseStackEnqueue() {
		if(stackDequeue.isEmpty()) {
			while(!stackEnqueue.isEmpty()) {
				stackDequeue.push(stackEnqueue.pop());
			}
		}
		
	}


}
