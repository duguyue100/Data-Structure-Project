
public class LinList<T> {
	private Node<T> header;
	private int n;
	
	public LinList()
	{
		header=new Node<T>();
		n=0;
	}
	
	public void addLast(T item)
	{
		Node<T> node=new Node(item);
		Node<T> curr=header;
		
		while (curr.getNext()!=null)
		{
			curr=curr.getNext();
		}
		
		Node<T> s=curr.getNext();
		curr.setNext(node);
		node.setNext(s);
		n++;
	}
	
	public T removeFirst()
	{
		Node<T> first=header.getNext();
		T tmp=first.getNodeValue();
		header.setNext(first.getNext());
		n--;
		
		return tmp;
	}
	
	public boolean isEmpty()
	{
		if (header.getNext()==null)
			return true;
		else return false;
	}
	
	public int size()
	{
		return n;
	}
	
	public String toString()
	{
		Node<T> curr=header.getNext();
		String out="[";
		while (curr!=null)
		{
			out+=curr.getNodeValue().toString()+",";
			curr=curr.getNext();
		}
		
		return out+"]";
	}
}
