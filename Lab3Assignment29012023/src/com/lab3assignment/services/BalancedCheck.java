package com.lab3assignment.services;

import java.util.Stack;

public class BalancedCheck {

	public static boolean CheckBalancedBrackets(String str)
	{
		Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < str.length(); i++)
			{
				char bracket = str.charAt(i);
				if (bracket == '(' || bracket == '[' || bracket == '{')
			{
				stack.push(bracket);
				continue;
			}
				if (stack.isEmpty())
				return false;
			
				char check;
			
				if(bracket == ')')
				{
				check = stack.pop();
				if (check == '{' || check == '[')
				return false;
				}
				else if(bracket == '}')
				{
				check = stack.pop();
				if (check == '(' || check == '[')
				return false;
				}
			
				else if(bracket == ']')
				{
				check = stack.pop();
				if (check == '(' || check == '{')
				return false;
				}

			}
		return (stack.isEmpty());
	}

}
