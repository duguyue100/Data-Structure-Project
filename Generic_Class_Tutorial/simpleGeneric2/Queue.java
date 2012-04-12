// Same as Stack, now we use ArrayList to store it.
// In traditional way, we use array to store it. And we usually
// design the array as a ring array.

// Author: Hu Yuhuang (duguyue100)
// E-mail: duguyue100@gmail.com

import java.util.*;

public class Queue<T> {
	public List elements=new ArrayList();
	
	// optional.
	private int Maximum=100000;
	
	public Queue(T... e)
	{
		for (T i:e)
		{
			insert(i);
		}
	}
	
	public Queue(int size,T... e)
	{
		Maximum=size;
		
		for (T i:e)
		{
			insert(i);
		}
	}
	
	public void insert(T e)
	{
		if (checkSize()==false)
			elements.add(e);
		else System.out.println("Queue has fulfilled.");
	}
	
	// not a safe way, You can change T to Object.
	public T get()
	{
		T result=(T)elements.get(0);
		elements.remove(0);
		
		return result;
	}
	
	// Optional.
	public boolean checkSize()
	{
		if (elements.size()>=Maximum)
			return true;
		else return false;
	}
}
