package stack;

public class StackUsingLinkedlist {

	private Node head;
	private int size;
	
	public StackUsingLinkedlist()
	{
		head=null;
		size=0;
	}
	
	public int getsize()
	{
		return size;
	}
	
	public int top()
	{
		 if(size==0) {
				return -1;
			}
			return head.data;
	}
	
	public boolean isEmpty()
	{
		if(size==0)
			return true;
		else 
			return false;
	}
	
	
	public void push(int ele)
	{
		Node newNode= new Node(ele);
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
		
		size++;
	}
	
	public int pop()
	{
		if(isEmpty()) 
		{
			return -1;
		}
		size--;
		int data = head.data;
		head = head.next;
		
		return data;
	}
	
	
}
