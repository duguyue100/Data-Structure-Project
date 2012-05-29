
public class DList<E> implements Comparable<DList<E>>{
	public DNode<E> head;
	public DNode<E> tail;
	
	public DList()
	{
		head=new DNode<E>();
		tail=new DNode<E>();
		
		head.setNext(tail);
		tail.setPrev(head);
	}
	
	public void add(E item)
	{
		DNode<E> tmp=tail.getPrev();
		DNode<E> node=new DNode<E>(item);
		
		tmp.setNext(node);
		node.setPrev(tmp);
		tail.setPrev(node);
		node.setNext(tail);
	}
	
	public int size(DNode<E> curr)
	{
		if (curr.getNext()==tail)
			return 0;
		else return size(curr.getNext())+1;
	}

	public int compareTo(DList<E> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public E remove(int n)
	{
		DNode<E> curr=head.getNext();
		int l=1;
		while (l<n)
		{
			curr=curr.getNext();
			l++;
		}
		
		DNode<E> node=curr.getPrev();
		node.setNext(curr.getNext());
		curr.getNext().setPrev(node);
		
		return curr.getNodeValue();
	}
	
	public String toString()
	{
		DNode<E> curr=head.getNext();
		String out="[";
		while (curr!=tail)
		{
			out+=curr.getNodeValue().toString()+",";
			curr=curr.getNext();
		}
		
		return out+"]";
	}
	
}
