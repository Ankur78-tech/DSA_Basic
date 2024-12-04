package generics;

public class Generic1Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generic1<Integer,Integer> internalPair= new Generic1(12,34);
		Generic1<Generic1<Integer,Integer>,String> p= 
				new Generic1<>(internalPair,"ankur");
		
		internalPair.setFirst(21);
		internalPair.setSecond(56);
		
		System.out.println(internalPair.getFirst());
		System.out.println(p.getFirst().getFirst());
		System.out.println(internalPair.getSecond());
		System.out.println(p.getFirst().getSecond());
		System.out.println(p.getSecond());
	}
}
