package linkedList;


public class Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> node1= new Node<Integer>(10);
		
		System.out.println(node1.data);
		System.out.println(node1.next);
		
		Node<Integer> node2= new Node<>(20);
		 node1.next=node2;
		 System.out.println(node2);
		 System.out.println(node2.next);
		 System.out.println(node2.data);
		
//		Node<Integer> node1= new Node<Integer>(10);
//		Node<Integer> node2= new Node<Integer>(20);
		Node<Integer> node3= new Node<Integer>(30);
		
	  node1.next=node2;
	  node2.next=node3;
	  
	  Node<Integer> head= node1;
	   while(head!=null)
	   {
		   System.out.print(head.data+" "+head.next);
		   head=head.next;
		   System.out.println();
	   }
	}

}
