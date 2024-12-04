package generics;

public class Generic1<T,V> {
    private T first;
    private V second;
    
    public Generic1(T first, V second)
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

	public V getSecond() {
		return second;
	}

	public void setSecond(V second) {
		this.second = second;
	}
    
}
