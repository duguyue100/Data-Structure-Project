
public class DList<T> {
	private DNode<T> header;
	private DNode<T> tail;
	
	public DList()
	{
		header=new DNode<T>(null);
		tail=new DNode<T>(null);
		
		header.setNext(tail);
		tail.setPrev(header);
	}
	
	public int size()
	{
		DNode<T> curr=header.getNext();
		
		int s=0;
		while (curr!=tail)
		{
			s++;
			curr=curr.getNext();
		}
		
		return s;
	}
	
	public boolean add(T item, int n)
	{
		if (n>size() || n<0) return false;
		DNode<T> node=new DNode<T>(item);
		DNode<T> curr=header;
		int i=0;
		
		while (i<n) 
		{
			curr=curr.getNext();
			i++;
		}
		
		DNode<T> node1=curr.getNext();
		curr.setNext(node);
		node.setPrev(curr);
		node.setNext(node1);
		node1.setPrev(node);
		
		return true;
	}
	
	public String toString()
	{
		DNode<T> curr=header.getNext();
		String out="[";
		
		while (curr!=tail)
		{
			out+=curr.getNodeValue().toString()+",";
			curr=curr.getNext();
		}
		
		return out+"]";
	}
}
