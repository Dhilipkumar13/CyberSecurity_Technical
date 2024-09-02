package STACK;
import java.util.*;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack=new Stack<>();
		String str="{()()(){}}";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='(' || c=='{' || c=='[')
			{
				stack.push(c);
			}
			else if(!stack.isEmpty() && ( c==')' || c=='}' || c==']'))
			{
				if(c==')' && stack.peek()=='(' || c=='}' && stack.peek()=='{' || c==']' && stack.peek()=='[')
					stack.pop();
				else 
					break;
			}
			else 
			{
				break;
			}
		}
		if(stack.isEmpty()) {
			System.out.print("Valid Paranthesis");
		}
		else
		{
			System.out.print(" Not Valid Paranthesis");
			
		}
	}

}
