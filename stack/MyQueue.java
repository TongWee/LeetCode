package stack;

import java.util.Stack;

public class MyQueue {
	// push element
	private Stack<Integer> stack1 = new Stack<Integer>();
	// pop element
	private Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int x) {
		stack1.push(x);
	}

	public void pop() {
		// reverse
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack2.pop();
		// reverse again
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}

	public int peek() {
		// reverse
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		int res = stack2.peek();
		// reverse again
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return res;
	}

	public boolean empty() {
		return stack1.isEmpty();
	}
}
