
public class DNode<T> {
	private T nodeValue;
	private DNode<T> prev;
	private DNode<T> next;
	
	public DNode(T item)
	{
		nodeValue=item;
		prev=next=null;
	}
	
	public void setNodeValue(T item)
	{
		nodeValue=item;
	}
	
	public T getNodeValue()
	{
		return nodeValue;
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
