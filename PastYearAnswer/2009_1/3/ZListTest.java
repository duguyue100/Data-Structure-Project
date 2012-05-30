
public class ZListTest {
	public static void main(String[] args)
	{
		ZList<Integer> list=new ZList<Integer>();
		
		list.insertAscending(1);
		list.insertAscending(2);
		list.insertAscending(5);
		list.insertAscending(2);
		list.insertAscending(3);
		
		System.out.println(list.toString());
	}
}
