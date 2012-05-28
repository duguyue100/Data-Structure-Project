
public class DList<T> {
	public DNode<T> header;
	public DNode<T> tail;
	
	public DList()
	{
		header=new DNode<T>(null);
		tail=new DNode<T>(null);
		header.setNext(tail);
		tail.setPrev(header);
	}
	
	public void append(DNode<T> e)
	{
		DNode<T> p=tail.getPrev();
		
		tail.setPrev(e);
		e.setNext(tail);
		e.setPrev(p);
		p.setNext(e);
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
	
	public DNode<T> get(int n)
	{
		DNode<T> curr=header.getNext();
		if (n>size()|| n<0) return null;
		else
		{
			int i=0;
			while (i!=n)
			{
				curr=curr.getNext();
				i++;
			}
			return curr;
		}
	}
	
	public String toString()
	{
		String out="[";
		DNode<T> curr=header.getNext();
		
		while (curr!=tail)
		{
			out=out+curr.getnodeValue().toString()+",";
			curr=curr.getNext();
		}
		
		out+="]";
		
		return out;
	}
}
