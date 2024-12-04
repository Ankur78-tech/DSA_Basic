package stack;

import java.util.Scanner;

public class StackUseLL {
	private static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingLinkedlist stack = new StackUsingLinkedlist();

		int q = s.nextInt();

		while (q > 0) {
			int choice, input;
			choice = s.nextInt();

			switch(choice) {
				case 1:
					input = s.nextInt();
					stack.push(input);
					break;

				case 2:
					System.out.println(stack.pop());
					break;

				case 3:
					System.out.println(stack.top());
					break;

				case 4:
					System.out.println(stack.getsize());
					break; 

				default: 
					System.out.println((stack.isEmpty()) ? "true" : "false");
			}

			q -= 1;
		}

	}

}
