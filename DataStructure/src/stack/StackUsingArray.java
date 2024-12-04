package stack;

public class StackUsingArray {
	private int data[];
	private int top;

	public StackUsingArray()
	{
		data= new int[10];
		top=-1;
	}

	public StackUsingArray(int capacity)
	{
		data= new int[capacity];
		top=-1;
	}

	public boolean isEmpty()
	{
		if(size()==0)
			return true;
		else
			return false;
	}

	public int size()
	{
		return top+1;
	}

	public int top() throws stackemptyexception
	{
		if(size()==0)
		{
			//stack empty exception
			stackemptyexception e= new stackemptyexception();
			throw e;			
		}
		return data[top];
	}

	public void push(int ele) throws stackfullexception
	{
		if(size()==data.length)
		{
			//stack full exception
			stackfullexception e= new stackfullexception(); 
			throw e;
		}
		top++;
		data[top]= ele;	
	}

	public int pop() throws stackemptyexception
	{
		if(size()==0)
		{
			//stack empty exception
			stackemptyexception e= new stackemptyexception();
			throw e;			
		}

		int temp= data[top];
		top--;
		return temp;
	}
}
