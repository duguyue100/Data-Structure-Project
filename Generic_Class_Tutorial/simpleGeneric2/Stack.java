// A Stack which defined via ArrayList.
// Very simple code, actually, when we design algorithm,
// we usually use array to represent stack.
// However, for dynamic usages, modern Engineering suggest
// to use dynamic array such as ArrayList to represent it.

// normally, we have a pointer to point the location of newest element.
// here, because we can use properties which are provided by ArrayList,
// so I just show how a stack work.

// Author: Hu Yuhuang (duguyue100)
// E-mail: duguyue100@gmail.com

import java.util.*;

public class Stack<T> {
	public List elements=new ArrayList();
	
	// optional.
	private int Maximum=10000;
	
	public Stack(T... e)
	{
		for (T i:e)
		{
			push(i);
		}
	}
	
	public Stack()
	{
		
	}
	
	public void push(T e)
	{
		if (checkSize()==false)
			elements.add(0, e);
		else System.out.println("Stack has fulfilled.");
	}
	
	public T pop()
	{
		T result=(T)elements.get(0);
		elements.remove(0);
		
		return result;
	}
	
	// optional.
	public boolean checkSize()
	{
		if (elements.size()>=Maximum)
			return true;
		else return false;
	}
}
