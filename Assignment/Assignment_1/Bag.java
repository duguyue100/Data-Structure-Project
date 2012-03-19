import java.util.*;
public class Bag<T> {
	public List elements=new ArrayList();
	
	public static <T> Bag<T> union(Bag<T> bagA, Bag<T> bagB)
	{
		Bag<T> bagResult=new Bag<T>();
		
		bagResult.elements.addAll(bagA.elements);
		
		for (int i=0;i<bagB.elements.size();i++)
		{
			boolean flag=false;
			for (int j=0;j<bagResult.elements.size();j++)
			{
				if (bagB.elements.get(i)==bagResult.elements.get(j))
					flag=true;
			}
			
			if (flag==false)
			{
				bagResult.elements.add(bagB.elements.get(i));
			}
			
			flag=false;
		}
		
		return bagResult;
	}
	
	public static <T> Bag<T> intersection(Bag<T> bagA, Bag<T> bagB)
	{
		Bag<T> bagResult=new Bag<T>();
		
		for (int i=0;i<bagA.elements.size();i++)
		{
			boolean flag=false;
			for (int j=0;j<bagB.elements.size();j++)
			{
				if (bagA.elements.get(i)==bagB.elements.get(j))
				{
					flag=true;
					break;
				}
			}
			if (flag==true)
			{
				bagResult.elements.add(bagA.elements.get(i));
			}
			flag=false;
		}
		
		return bagResult;
	}
	
	public static <T> Bag<T> difference(Bag<T> bagA, Bag<T> bagB)
	{
		Bag<T> bag1=bagA.union(bagA, bagB);
		Bag<T> bag2=bagA.intersection(bagA, bagB);
		
		for (int i=0;i<bag1.elements.size();i++)
		{
			for (int j=0;j<bag2.elements.size();j++)
			{
				if (bag1.elements.get(i)==bag2.elements.get(j))
				{
					bag1.elements.remove(bag1.elements.get(i));
				}
			}
		}
		return bag1;
	}
	
	public void add(T e)
	{
		elements.add(e);
	}
	
	public void print()
	{
		for (int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i));
		}
	}
}
