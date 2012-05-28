
public class DNode<T> {
	private T nodeValue;
	private DNode<T> prev;
	private DNode<T> next;
	
	public DNode(T item)
	{
		nodeValue=item;
		prev=next=null;
	}
	
	public T getnodeValue()
	{
		return nodeValue;
	}
	
	public void setNodeValue(T item)
	{
		nodeValue=item;
	}
	
	public DNode<T> getPrev()
	{
		return prev;
	}
	
	public void setPrev(DNode<T> node)
	{
		prev=node;
	}
	
	public DNode<T> getNext()
	{
		return next;
	}
	
	public void setNext(DNode<T> node)
	{
		next=node;
	}
}
