package core.java.apis.stack;

public class ArrayStack<E> implements Stack<E> {

	// default stack size
	private static final int DEFAULT_SIZE = 16;

	private static final int MAX_SIZE = Integer.MAX_VALUE;

	// container to hold stack elements
	private Object[] internalContainer;

	// stack top pointer, initially pointing to -1
	private int top = -1;

	/**
	 * Default constructor creates stack with default size of 16
	 */
	public ArrayStack() {
		this(DEFAULT_SIZE);
	}

	/**
	 * constructor creates stack with given size. Size should be greater than 0
	 * and lesser than Integer.MAX_VALUE
	 */
	public ArrayStack(int size) {
		if (size < 1 || size > MAX_SIZE) {
			throw new RuntimeException("Invalid stack size:" + size);
		}
		internalContainer = new Object[size];
	}

	/**
	 * push new element, E onto stack throws exception if stack is full
	 */
	public void push(E element) {
		if (isFull()) {
			throw new RuntimeException(
					"stack is full. You cannot push any element further!!!");
		}
		top++;
		internalContainer[top] = element;
	}

	/**
	 * pop top element from the stack throws exception if stack is empty
	 */
	@SuppressWarnings("unchecked")
	public E pop() {
		if (isEmpty()) {
			throw new RuntimeException(
					"stack is empty. You cannot pop further!!!");
		}
		Object lReturnElement = internalContainer[top];
		internalContainer[top] = null;
		top--;
		return (E) lReturnElement;
	}

	public int size() {

		return top + 1;
	}

	public boolean isFull() {

		return top == internalContainer.length - 1;
	}

	public boolean isEmpty() {

		return top < 0;
	}

	@Override
	public String toString() {
		StringBuilder lStringBuilder = new StringBuilder();
		lStringBuilder.append("[");
		for (Object element : internalContainer) {
			if (null != element) {
				lStringBuilder.append(" ").append(element).append(" ");
			}
		}
		lStringBuilder.append("]");
		return lStringBuilder.toString();
	}
}
