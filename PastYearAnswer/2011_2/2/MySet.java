
public class MySet<T> {
	public DList<T> setElements=new DList<T>();
	
	public boolean add(T e)
	{
		DNode<T> element=new DNode<T>(e);
		DNode<T> curr=setElements.header.getNext();
		
		boolean flag=true;
		while (curr!=setElements.tail)
		{
			if (curr.getnodeValue()==e)
			{
				flag=false;
				break;
			}
			curr=curr.getNext();
		}
		
		if (flag==true) 
		{
			setElements.append(element);
			return true;
		}
		else return false;
	}
	
	public boolean contains(T e)
	{
		DNode<T> curr=setElements.header.getNext();
		
		while (curr!=setElements.tail)
		{
			if (curr.getnodeValue()==e)
				return true;
			curr=curr.getNext();
		}
		
		return false;
	}
	
	public T get(int index)
	{
		return setElements.get(index).getnodeValue();
	}
	
	public MySet union(MySet otherSet)
	{
		MySet tmp=this;
		DNode<T> curr=otherSet.setElements.header.getNext();
		
		while (curr!=otherSet.setElements.tail)
		{
			tmp.add(curr.getnodeValue());
			curr=curr.getNext();
		}
		
		return tmp;
	}
	
	public MySet intersect(MySet otherSet)
	{
		MySet tmp=new MySet();
		MySet tmp1=this;
		DNode<T> curr=otherSet.setElements.header.getNext();
		
		while (curr!=otherSet.setElements.tail)
		{
			if (tmp1.add(curr.getnodeValue())==false)
				tmp.add(curr.getnodeValue());
			
			curr=curr.getNext();
		}
		
		return tmp;
	}
}
