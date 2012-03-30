// just a raw implementation.

// Programming for fun!

// Author: Hu Yuhuang (duguyue100)
// E-mail: duguyue100@gmail.com

import java.util.*;
public class SimpleTest {
	public static void main(String[] args)
	{
		Tree<String> t=new Tree();
		
		for (int i=0;i<7;i++)
			t.addNode();
		
		System.out.println(t.elements.get(0).value.toString());
		t.printTree(0);
	}
}
