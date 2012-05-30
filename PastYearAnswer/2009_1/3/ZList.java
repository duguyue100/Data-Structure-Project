
public class ZList<T> implements Comparable<T> {
	private Node<T> header;
	
	public ZList()
	{
		header=new Node<T>();
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

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
