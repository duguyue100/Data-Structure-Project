
public class DListTest {
	public static void main(String[] args)
	{
		DList<Integer> list=new DList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list.toString());
		
		System.out.println(list.size(list.head));
		
		System.out.println(list.remove(2));
		System.out.println(list.toString());
	}
}
