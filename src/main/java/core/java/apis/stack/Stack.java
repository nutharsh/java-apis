package core.java.apis.stack;

public interface Stack<E> {
	void push(E element);
	E pop();
	int size();
	boolean isFull();
	boolean isEmpty();
}
