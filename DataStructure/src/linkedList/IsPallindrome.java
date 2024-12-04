package linkedList;

import java.util.Scanner;

public class IsPallindrome {

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

	public static boolean pallindrome(Node<Integer> head) {

		if(head==null || head.next==null)
			return true;

		Node<Integer> mid= midpoint(head);
		Node<Integer> midNext= mid.next;
		mid.next=null;

		Node<Integer> head2=reverse(midNext);

		Node<Integer> t1=head, t2=head2;
		while(t1!=null && t2!=null)
		{
			if(!t1.data.equals(t2.data))
				return false;
			t1=t1.next;
			t2=t2.next;
		}

		return true;
	}

	public static Node<Integer> reverse(Node<Integer> head) {
		if(head==null || head.next==null)
			return head;

		Node<Integer> small= reverse(head.next);
		Node<Integer> temp=small;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;

		return small;
	}

	public static Node<Integer> midpoint(Node<Integer> head) {
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

		System.out.println(pallindrome(head));
	}

}
