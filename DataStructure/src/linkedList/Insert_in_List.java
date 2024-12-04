package linkedList;

import java.util.Scanner;

public class Insert_in_List {

	public static Node<Integer> takeinput()
	{
	  Scanner sc= new Scanner(System.in);
	  int data = sc.nextInt();
	  Node<Integer> head=null, tail=null;
	  while(data!=-1)
	  {
		  Node<Integer> newNode=new Node<Integer>(data);
		  if(head==null)
		  {
			  head=newNode;
			  tail=newNode;
		  }
		  else
		  {
			  tail.next=newNode;
			  tail=tail.next; 
		  }
		  data=sc.nextInt();
	  }
	  return head;
	}
	
	public static Node<Integer> insert(Node<Integer> head,int ele,int index)
	{
		Node<Integer> newNode= new Node<Integer>(ele);
		Node<Integer> temp= head;
		if(index==0)
		{
			newNode.next=head;
			head=newNode;
			return head;
		}
		
		int i=0;
		while(i<index-1) 
		{
		  temp=temp.next;
		  i++;
		}
		newNode.next=temp.next;
		 temp.next=newNode;
	
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
		// TODO Auto-generated method stub
		
		Node<Integer> head=takeinput();
		
		head= insert(head,20,0);
		
		print(head);
		
	}

}
