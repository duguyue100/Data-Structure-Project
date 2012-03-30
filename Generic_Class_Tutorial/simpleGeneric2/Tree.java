// This is a possible way to represent tree.
// For me, I may have seen more than ten different way to represent tree.
// The key point to represent tree is to store the connection via
// all kinds of ways.

// Another simple way to represent tree is introduced in Introduction to 
// Algorithm. I may give the code in the future, you better check that.

// Author: Hu Yuhuang (duguyue100)
// E-mail: duguyue100@gmail.com

import java.util.*;

public class Tree<T> {
	public List<node> elements=new ArrayList();
	
	class node
	{
		public T value;
		public int parent;
	}
	
	public void addNode()
	{
		Scanner inputValue=new Scanner(System.in);
		System.out.print("Node's value: ");
		node n=new node();
		
		// unsafe.
		n.value=(T)inputValue.nextLine();
		
		System.out.print("Node's parent: ");
		T p=(T)inputValue.nextLine();
		boolean flag=false;
		
		if (elements.size()==0)
		{
			
		}
		else
		{
			for (int i=0;i<elements.size();i++)
			{
				if (elements.get(i).value.equals(p))
				{
					flag=true;
					n.parent=i;
				}
			}
		}
		
		// when parent=0, means node n is root node. actually, it is not a safe
		// way to determine root node.
		// we should check there is only one root node.
		// Here, I want to make the structure clear, so I didn't do the check.
		if (flag==false)
		{
			n.parent=0;
		}
		
		elements.add(n);
	}
	
	// actually a DFS process.
	public void printTree(int index)
	{
		for (int i=1;i<elements.size();i++)
		{
			if (elements.get(i).parent==index)
			{
				System.out.println(elements.get(i).value.toString());
				printTree(i);
			}
		}
	}
}
