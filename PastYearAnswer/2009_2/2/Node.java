
public class Node<T> {
	private T nodeValue;
	private Node<T> next;
	
	public Node()
	{
		nodeValue=null;
		next=null;
	}
	
	public Node(T item)
	{
		nodeValue=item;
		next=null;
	}
	
	public T getNodeValue()
	{
		return nodeValue;
	}
	
	public void setNodeValue(T item)
	{
		nodeValue=item;
	}
	
	public Node<T> getNext()
	{
		return next;
	}
	
	public void setNext(Node<T> node)
	{
		next=node;
	}
}
