package com.gl.q1;

import java.util.Stack;
import java.util.Scanner;
public class BalancingBracket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String bracketExpression;
		System.out.print("Enter the expression:");
		bracketExpression = scanner.next();
		boolean result;

		result = isBracketBalanced(bracketExpression);
		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
		scanner.close();
	}

	private static boolean isBracketBalanced(String bracketExpression) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < bracketExpression.length(); i++) {
			Character ch = bracketExpression.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				stack.push(ch);
			else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty())
					return false;
				stack.pop();
			}

		}
		return stack.isEmpty() ? true : false;
		
	}

}
