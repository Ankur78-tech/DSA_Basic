package linkedList;

import java.util.Scanner;

public class AppendLastNtoFirst {

	public static Node<Integer> takeInput() {
		Scanner s= new Scanner(System.in);
		int data= s.nextInt();
		
	    Node<Integer> head=null, tail=null;
	    
	    while(data!=-1)
	    {
	    	Node<Integer> newNode= new Node<Integer>(data);
	    	if(head==null)
	    	{
	    		head=newNode;
	    		tail=newNode;
	    	}
	    	else
	    	{
	    		tail.next=newNode;
	    		tail=newNode;
	    	}
	    	
	    	data=s.nextInt();
	    }
	    return head;
	}
	
	public static void print(Node<Integer> head) {
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		
	}
	
	public static void append(Node<Integer> head,int i) {
		Node<Integer> temp= head;
		int size = 0;
		while(temp!=null)
		{
		     size++;
			temp=temp.next;
		}
		temp=head;
		int opr=size-i;
		
		int x=0;
		System.out.println();
		
		while(x<opr)
		{
			 //System.out.print(temp.data+" ");
			temp=temp.next;
			x++;
		}
		
		while(temp!=null)
		{
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		}
		
		int y=0;
		while(y<=i)
		{
			System.out.print(head.data+" ");
			head=head.next;
			y++;
		}
       
		
	}

	public static void main(String[] args) {

		Node<Integer> head= takeInput();
		print(head);
		
		append(head,3);
	}

}
