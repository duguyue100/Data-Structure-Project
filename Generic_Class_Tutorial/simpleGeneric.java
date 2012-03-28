// This is a simplest generic class.
// According to the meaning to generic class, programmer should put
// a <T> after class' name.
// <T> can be considered as Object.
// Thus, when you declare a generic object in other class,
// you need to change <T> to a appropriate type, such as <String>, <Integer>
// In this example, the only difference is that we replaced a specific
// type into T. You can understand this code easily.

// Author: Hu Yuhuang (duguyue100)
// E-mail: duguyue100@gmail.com

import java.util.*;
public class simpleGeneric<T> {
	public T t;
	
	public simpleGeneric(T t1)
	{
		t1=t;
	}
	
	public simpleGeneric()
	{
		
	}
	
	public T getT()
	{
		return t;
	}
	
	public void setT(T t1)
	{
		t1=t;
	}
	
	public void print()
	{
		System.out.println(t.toString());
	}
}
