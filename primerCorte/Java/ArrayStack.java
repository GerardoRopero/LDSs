package estructuraDatosLineales;

public class ArrayStack<T> {
	private T[] stack;
	private int head;
	private int capacity;
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		this.stack = (T[]) new Object[capacity];
		this.head = -1;
		this.capacity = capacity;
	}
	
	public boolean isEmpty() {
		return head == -1;
	}
	
	public boolean isFull() {
		return head == capacity - 1;
	}
	
	public void push(T data) {
		if (isFull()) {
			throw new StackOverflowError("Stack is full.");
		}
		
		stack[++head] = data;
	}
	 
	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty.");
		}
		
		return stack[head--];
	}
	
	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty.");
		}
		
		return stack[head];
	}
}
