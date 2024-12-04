package generics;

import java.util.Scanner;

public class Array {
	
	public static<T> void print(T arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        
		Integer size= sc.nextInt();
		
		Integer arr[] = new Integer[size];
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		String s[]= new String[size];
		for(int i=0; i<size; i++)
		{
			s[i]=sc.next();
		}
		
		print(arr);
		System.out.println();
		print(s);
	}

}
