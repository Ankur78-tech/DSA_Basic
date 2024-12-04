package linkedList;

import java.util.Scanner;

public class MergeSort {
	
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
			
			mergesort(head);
		}

	}
	
	public static Node<Integer> mergesort(Node<Integer> head) {
		if(head==null || head.next==null)
			return head;
		
		Node<Integer> middle= getMiddle(head);
		Node<Integer> nextmid=middle.next;
	        middle.next=null;
	        
	    Node<Integer> first= mergesort(head);
	    Node<Integer> second= mergesort(nextmid);
	    
	    return merge(first,second);
	        
	}

	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
		if(head1==null)
			return head2;
		
		if(head2==null)
			return head1;
		
		Node<Integer> head=null, tail=null;
		Node<Integer> t1= head1, t2=head2;
		
		if(t1.data<= t2.data)
		{
			head=t1;
			tail=t1;
		    t1=t1.next;
		}
		else
		{
			head=t2;
			tail=t2;
			t2=t2.next;
		}
		while(t1!=null && t2!=null)
		{
			if(t1.data<= t2.data)
			{
				tail.next=t1;
				tail=t1;
				t1=t1.next;
			}
			else
			{
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
		}
		if(t1==null)
			tail.next=t2;
		else
			tail.next=t1;
		
		return head;
		
	}

	public static Node<Integer> getMiddle(Node<Integer> head) {
		if(head==null || head.next==null)
			return head;
		
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		Node<Integer> head= takeInput();
		//print(head);
		
		print(mergesort(head));

	}

}
