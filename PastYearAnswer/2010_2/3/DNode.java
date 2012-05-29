
public class DNode<E> {
	private E nodeValue;
	private DNode<E> next;
	private DNode<E> prev;
	
	public DNode()
	{
		nodeValue=null;
		next=null;
		prev=null;
	}
	
	public DNode(E item)
	{
		nodeValue=item;
		next=null;
		prev=null;
	}
	
	public E getNodeValue()
	{
		return nodeValue;
	}
	
	public void setNodeValue(E item)
	{
		nodeValue=item;
	}
	
	public DNode<E> getNext()
	{
		return next;
	}
	
	public void setNext(DNode<E> node)
	{
		next=node;
	}
	
	public DNode<E> getPrev()
	{
		return prev;
	}
	
	public void setPrev(DNode<E> node)
	{
		prev=node;
	}
}
