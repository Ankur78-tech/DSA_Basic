package generics;

public class GenericPairUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 GenericPair<Integer> p= new  GenericPair<Integer>(4,12);
		 p.setFirst(12);
		 System.out.println(p.getFirst());
		 
		 GenericPair<String> s= new GenericPair<String>("ab","cd");
		 s.setFirst("gh");
		 System.out.println(s.getFirst());
	}

}
