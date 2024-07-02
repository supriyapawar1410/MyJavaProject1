package Collection;

import java.util.Stack;

public class StacksInJava {

	public static void main(String[] args) {
		
		Stack<Integer> stack= new Stack<Integer>();
		
		stack.push(23);
		stack.push(24);
		stack.push(25);
		stack.push(26);
		stack.push(27);
		
		System.out.println(stack);
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println(stack);

	}

}
