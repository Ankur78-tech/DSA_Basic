package linkedList;

import java.util.Scanner;

//using head and tail
public class User_input_list {
	public static Node<Integer> takeinput()
	{
	  	Node<Integer> head= null;
	  	Node<Integer> tail= null;
	  	
	  	Scanner s= new Scanner(System.in);
	  	int data = s.nextInt();
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
	  		//tail=tail.next;
	  		}
	  		data=s.nextInt();
	  	}
	  	return head;
	}
	
   public static void print(Node<Integer> head)
   {
	while(head!=null)
	{
		System.out.print(head.data+" ");
		 head=head.next;
	}
   }

	public static void main(String[] args) {
		

		Node<Integer> head=takeinput();
		
		print(head);
		
	}

}
