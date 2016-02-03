import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Stack<T> {
	private int top = 0;
	//private T[] tab;
	//private int maxSize;
	private List<T> list = new ArrayList<T>();
	
	/*public Stack(int i) {
		maxSize = i;
		tab = new T[maxSize];	
	}*/

	public boolean isEmpty() {
		if (top==0)
			return true;
		else
			return false;
	}

	public boolean push(T object) {
		/*if(top >= maxSize)
		{
			throw new IllegalStateException("Cannot push in full stack");
		}
		tab[top]=object;*/
		list.add(object);
		top++;
		return true;		
	}

	public T pop() {
		if (top == 0) {
            throw new NoSuchElementException("Cannot pop from empty stack");
        }
		top--;
		T object = list.get(top);
		list.remove(top);
		//return tab[top];
		return object;
	}

	public T top() {
		if(top <= 0)
		{
			throw new NoSuchElementException("Cannot top into empty stack");
		}
		//return tab[top-1];
		return list.get(top-1);
	}
}
