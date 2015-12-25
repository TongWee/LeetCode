package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	Queue<Integer> q1 = new LinkedList<Integer>();

	// Push element x onto stack.
	public void push(int x) {
		q1.add(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		Queue<Integer> q2 = new LinkedList<Integer>();
		while (!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		int len = q2.size();
		for (int i = 1; i < len; i++)
			q1.add(q2.poll());
	}

	// Get the top element.
	public int top() {
		Queue<Integer> q2 = new LinkedList<Integer>();
		int temp = 0;
		while (!q1.isEmpty()) {
			temp = q1.poll();
			q2.add(temp);
		}
		while (!q2.isEmpty()) {
			q1.add(q2.poll());
		}
		return temp;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return q1.isEmpty();
	}
}
