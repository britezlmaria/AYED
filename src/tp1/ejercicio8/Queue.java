package tp1.ejercicio8;
import java.util.ArrayList;
import java.util.List;

public class Queue<T> extends Sequence {
	final List<T> data;
	
	public Queue() {
		data=new ArrayList<>();
	}
	public void enqueue(T dato) {
		data.add(dato);
	}
	public T dequeue() {
		if(data.isEmpty()) {
			throw new IndexOutOfBoundsException("the queue is empty");
		}
		return data.remove(0);
	}
	public T head() {
		if(data.isEmpty()) {
			throw new IndexOutOfBoundsException("the queue is empty");
		}
		return data.get(0);
	}
	public int size() {
		return data.size();
	}
	public boolean isEmpty() {
		return data.isEmpty();
	}
	public String toString() {
String str = "[";
		
		for (T d : data)
			str += d + ", ";
		str = str.substring(0, str.length() - 2) + "]";
		
		return str;
	}
	
}
