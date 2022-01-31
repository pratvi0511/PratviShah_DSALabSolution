package com.greatlearning;
import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {
	
	static boolean checkingBalancedBrackets(String bracketExpression) {
		//[{()}]
		boolean result = false;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<bracketExpression.length(); i++) 
		{
			char character = bracketExpression.charAt(i);
			if(character == '(' || character == '[' || character == '{') 
			{
				stack.push(character);
				continue;
			}
			if(stack.isEmpty()) 
			{
				return false;
			}
			char c;
			switch(character) 
			{
			   case '}': {
				  c = stack.pop();
				  if(c == '(' || c == '[') 
				  {
					  return false;
				  }
				  break;
			   }
			   
			   case ')': {
					  c = stack.pop();
					  if(c == '[' || c == '{') 
					  {
						  return false;
					  }
					  break;
			   }
			   
			   case ']': {
					  c = stack.pop();
					  if(c == '(' || c == '{') 
					  {
						  return false;
					  }
					  break;
			    }
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the string to check wheter it contains Balanced Brackets or not:");
		String bracketExpression = s.nextLine();
		boolean result;
		result = checkingBalancedBrackets(bracketExpression);
		if(result) 
		{
			System.out.println("The entered string is containing Balanced Brackets.");
		}
		else 
		{
			System.out.println("The entered string does not contain Balanced Brackets.");
		}
	}

}
