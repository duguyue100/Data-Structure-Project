// This is a set generic class, I defined some functions, very simple,
// you may want to have a look.

// Author: Hu Yuhuang (duguyue100)
// E-mail: duguyue100@gmail.com

import java.util.*;

public class Set<T> {
	public List elements=new ArrayList();
	
	public Set()
	{
		//just for fun.
	}
	
	// select first 10 elements and add them to another set.
	public Set<T> select()
	{
		Set<T> result=new Set();
		
		int i=0;
		while (i<elements.size()||i<10)
		{
			result.addElements(elements.get(i));
			i++;
		}
		
		return result;
	}
	
	
	
	public void addElements(Object e)
	{
		if (!elements.contains(e))
			elements.add(e);
	}
	
	public void removeElement(Object e)
	{
		if (elements.contains(e))
			elements.remove(e);
	}
	
	public void print()
	{
		if (!elements.isEmpty())
			System.out.println(elements.toString());
		else System.out.println("Empty Set");
	}
}
