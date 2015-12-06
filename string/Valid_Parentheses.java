package string;

import java.util.Stack;

public class Valid_Parentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.push('(');
			if (s.charAt(i) == ')') {
				if (!stack.isEmpty() && stack.pop() == '(')
					continue;
				else
					return false;
			}
			if (s.charAt(i) == '[')
				stack.push('[');
			if (s.charAt(i) == ']') {
				if (!stack.isEmpty() && stack.pop() == '[')
					continue;
				else
					return false;
			}
			if (s.charAt(i) == '{')
				stack.push('{');
			if (s.charAt(i) == '}') {
				if (!stack.isEmpty() && stack.pop() == '{')
					continue;
				else
					return false;
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}
}
