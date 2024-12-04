package stack;

public class ArrayUse {

	public static void main(String[] args) throws stackfullexception
	{
		StackUsingArray stack= new StackUsingArray();

		for(int i=0; i<=5; i++)
		{
			stack.push(i);
		}

		while(!stack.isEmpty())
		{
			try {
				System.out.println(stack.pop());
			} catch (stackemptyexception e) {

			}
		}

	}
}


