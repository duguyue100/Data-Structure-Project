
public class DListTest {
	public static void main(String[] args)
	{
		DList<Integer> list=new DList<Integer>();
		DNode<Integer> first=new DNode<Integer>(1);
		
		list.append(first);
		list.append(new DNode<Integer>(2));
		list.append(new DNode<Integer>(3));
		list.append(new DNode<Integer>(4));
		System.out.println(list.toString());
		
		System.out.println(list.size());
		
		System.out.println(list.get(3).getnodeValue());
		
		MySet<Integer> set=new MySet<Integer>();
		MySet<Integer> set1=new MySet<Integer>();
		
		set.setElements=list;
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(9);
		
		System.out.println("--------------");
		System.out.println(set.setElements.toString());
		System.out.println(set1.setElements.toString());
		System.out.println(set.union(set1).setElements.toString());
		
		MySet<Integer> set2=new MySet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(10);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		System.out.println("-------------------");
		System.out.println(set.setElements.toString());
		System.out.println(set2.setElements.toString());
		
		System.out.println(set.intersect(set2).setElements.toString());
		System.out.println("-------------------");
		System.out.println(set.setElements.toString());
		
	}
}
