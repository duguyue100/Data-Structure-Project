// Author: Hu Yuhuang (duguyue100)
// Metric No.: WEK110709
// E-mail: duguyue100@gmail.com

import java.util.*;

public class Ring {
	public LinkedList e=new LinkedList();
	
	public Ring()
	{
		
	}
	
	public void addE(String element)
	{
		e.add(element);
	}
	
	public void print()
	{
		System.out.println(e.toString());
	}
	
	public boolean terminate()
	{
		if (e.size()==1)
			return true;
		else return false;
	}
	
	public void eliminate(int m)
	{
		if (e.size()>=m)
			e.remove(m-1);
		else if (m%e.size()!=0)
		{
			e.remove(m%e.size()-1);
		}
		else e.remove(e.size()-1);
		for (int i=1;i<m;i++)
		{
			e.addLast(e.getFirst());
			e.removeFirst();
		}
	}
}
