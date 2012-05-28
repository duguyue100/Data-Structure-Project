
public class TListTest {
	public static void main(String[] args)
	{
		TList<Integer> list=new TList<Integer>();
		
		list.add(34);
		list.add(3);
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(45);
		
		System.out.println(list.toString());
		
		System.out.println(list.countItem(1));
		
		list.rearrangeDescending();
		
		System.out.println(list.toString());
	}
}
