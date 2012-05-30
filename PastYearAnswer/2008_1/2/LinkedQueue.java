
public class LinkedQueue<T> {
	public LinList<T> list=new LinList<T>();
	
	public T dequeue()
	{
		return list.removeFirst();
	}
	
	public void enqueue(T element)
	{
		list.addLast(element);
	}
	
	public int size()
	{
		return list.size();
	}
	
	public String toString()
	{
		return list.toString();
	}
}
