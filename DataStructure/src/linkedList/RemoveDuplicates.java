package linkedList;

import java.util.Scanner;

public class RemoveDuplicates {

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
			data= s.nextInt();
		}

		return head;
	}


	public static void print(Node<Integer> head) {
		Node<Integer> temp= head;

		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}

	}


	public static Node<Integer> duplicate(Node<Integer> head) {
		Node<Integer> t1=head;
		Node<Integer> t2=head.next;
		
		if(head==null || head.next==null)
			return head;

		while(t2.next!=null)
		{
			if(t1.data.equals(t2.data))
				t2=t2.next;
			else
			{
				t1.next=t2;
				t1=t2;
				t2=t2.next;
			}
		}

		t1.next=null;
		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head= takeInput();
		print(head);

		duplicate(head);
	}

}
