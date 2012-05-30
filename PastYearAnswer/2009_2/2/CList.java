
public class CList<T extends Comparable<? super T>> {
	private Node<T> header;
	private int count;
	
	public CList()
	{
		header=new Node<T>();
		count=0;
	}
	
	public <T extends Comparable<T>> void insertAscending(T item)
	{
		Node<T> node=new Node(item);
		Node<T> curr=(Node<T>) header;
		
		while (curr.getNext()!=null)
		{
			if (curr.getNext().getNodeValue().compareTo(item)>0)
				break;
			curr=curr.getNext();
		}
		
		Node<T> s=curr.getNext();
		curr.setNext(node);
		node.setNext(s);
	}

	
	public void removeRange(int s, int e)
	{
		Node<T> curr1=header;
		
		int i=0;
		while (i<s-1)
		{
			curr1=curr1.getNext();
			i++;
		}
		
		Node<T> curr2=curr1;
		
		while (i<e)
		{
			curr2=curr2.getNext();
			i++;
		}
		
		curr1.setNext(curr2.getNext());
	}
	
	public void swapFirstLast()
	{
		Node<T> first=header.getNext();
		Node<T> last=header;
		
		while (last.getNext()!=null)
		{
			last=last.getNext();
		}
		
		T t=first.getNodeValue();
		first.setNodeValue(last.getNodeValue());
		last.setNodeValue(t);
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
