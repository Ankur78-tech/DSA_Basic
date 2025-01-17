package generics;

public class GenericPair<T> {
      private T first;
      private T second;
      
      public GenericPair(T first, T second)
      {
    	  this.setFirst(first);
    	  this.setSecond(second);
      }

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}
	
}
