package linkedList;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		//to get size of list
		System.out.println(list.size());
		 
		//to add element in list
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 
	    System.out.println(list.size());
	    //to add element at mentioned index 
	      list.add(1, 15);
	     
	    //to get element of certain index
	    System.out.println(list.get(1));
	    
	    //to get whole list
	    for(int i=0; i<list.size(); i++)
	    {
	    	System.out.print(list.get(i)+ " ");
	    }
	    
	    //to remove element of certain index
	    list.remove(1);

	   //to replace value of index
	    list.set(1, 18);
	    
	    System.out.println();
	    
	    //for each loop
	    for(int element: list)
	    {
	    	System.out.print(element+ " ");
	    }
	}

}
