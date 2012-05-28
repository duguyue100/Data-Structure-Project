import java.util.*;
public class TList<T> {
	Node<T> header;
	
	public TList()
	{
		header=new Node<T>();
		header.setNext(null);
		header.setNodeValue(null);
	}
	
	public void add(T item)
	{
		Node<T> current=header;
		while (current.getNext()!=null)
			current=current.getNext();
		Node<T> newNode=new Node<T>(item);
		current.setNext(newNode);
	}
	
	public int countItem(T item)
	{
		Node<T> current=header.getNext();
		
		int occur=0;
		while (current!=null)
		{
			if (current.getNodeValue()==item)
				occur++;
			current=current.getNext();
		}
		
		return occur;
	}
	
	private <T extends Comparable<T>> Node<T> removeLargest()
	{
		Node<T> curr=(Node<T>) header.getNext();
		
		T largest=curr.getNodeValue();
		int l=0,l1=0;
		while (curr!=null)
		{
			if (curr.getNodeValue().compareTo(largest)>0)
			{
				largest=curr.getNodeValue();
				l1=l+1;
			}
			l++;
			curr=curr.getNext();
		}
		
		Node<T> tmp=new Node<T>();
		Node<T> tmp1=(Node<T>) header;
		int i=1;
		while (i<l1)
		{
			tmp1=tmp1.getNext();
			i++;
		}
		
		tmp=tmp1.getNext();
		tmp1.setNext(tmp.getNext());
		tmp.setNext(null);
		
		return tmp;
	}
	
	public void rearrangeDescending()
	{
		TList<T> tmp=new TList<T>();
		
		while (header.getNext()!=null)
			tmp.add((T)removeLargest().getNodeValue());
		
		header=tmp.header;
	}
	
	public String toString()
	{
		String out="[";
		Node<T> curr=header.getNext();
		
		while (curr!=null)
		{
			out+=curr.getNodeValue().toString()+",";
			curr=curr.getNext();
		}
		
		return out+"]";
	}
}
