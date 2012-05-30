
public class CListTest {
	public static void main(String[] args)
	{
		CList<Integer> list=new CList<Integer>();
		
		list.insertAscending(1);
		list.insertAscending(2);
		list.insertAscending(3);
		list.insertAscending(4);
		list.insertAscending(5);
		list.insertAscending(6);
		list.insertAscending(7);
		list.insertAscending(8);
		
		System.out.println(list.toString());
		
		list.removeRange(3, 6);
		
		System.out.println(list.toString());
		
		list.swapFirstLast();
		
		System.out.println(list.toString());
	}
}
