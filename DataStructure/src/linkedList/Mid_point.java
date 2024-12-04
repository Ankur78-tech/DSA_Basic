package linkedList;

import java.util.Scanner;

public class Mid_point {

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

	public static Node<Integer> midPoint(Node<Integer> head) {
		Node<Integer> slow= head;
		Node<Integer> fast= head;

		if(head==null)
			return null;
		
			while(fast.next!=null && fast.next.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
			}
		
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head= takeInput();
		print(head);
        System.out.println();
		System.out.println(midPoint(head).data);
	}

}
