package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Number> stack = new Stack<>();
		stack.push(12L);
		System.out.println("pushed 12L");
		printStack(stack);

		stack.push(34565);
		System.out.println("pushed 34565");
		printStack(stack);

		stack.push(1.0F);
		System.out.println("pushed 1.0F");
		printStack(stack);

		stack.push(1234.5587);
		System.out.println("pushed 1234.5587");
		printStack(stack);

		// remove items from stack

		try {
			Number removedObject = null;
			// pop elements from stack
			while (true) {
				removedObject = stack.pop();
				System.out.println("Popped : " + removedObject);
				printStack(stack);

			}
		} catch (EmptyStackException emptyStackException) {

			emptyStackException.printStackTrace();

		}

	}

	private static void printStack(Stack<Number> stack) {

		if (stack.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Stack contains : " + stack);

	}

}
