package linkedList;

import java.util.Scanner;

public class Deletion {
	
	public static Node<Integer> takeInput() {
		
		Scanner sc= new Scanner(System.in);
		int data= sc.nextInt();
		
		Node<Integer> head= null, tail=null;;
		
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
			    tail= newNode;
		    }
		data= sc.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp= head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
}
	
	public static Node<Integer> deletion(Node<Integer> head, int pos) {
		
		if(pos==0)
		{
			head=head.next;
			return head;
		}
		
		int i=0;
		Node<Integer> temp= head;
		while(i<pos-1)
		{
			temp=temp.next;
			i++;
		}
		temp.next=temp.next.next;
		
		return head;
	}


	public static void main(String[] args) {
		
		Node<Integer> head= takeInput();
		
		print(head); 
		
		head=deletion(head,4);
		
		print(head);
		
	}
}
