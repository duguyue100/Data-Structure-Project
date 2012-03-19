import java.util.*;
public class BagTest {
	public static void main(String[] args)
	{
		Bag<Integer> bag1=new Bag();
		Bag<Integer> bag2=new Bag();
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter the number of elements in Bag1: ");
		int n=input.nextInt();
		
		System.out.println("Please enter the elements in Bag1: ");
		for (int i=0;i<n;i++)
		{
			bag1.add(input.nextInt());
		}
		System.out.println();
		System.out.println("-----------");
		System.out.println("-----------");
		System.out.println();
		
		System.out.print("Please enter the number of elements in Bag2: ");
		n=input.nextInt();
		
		System.out.println("Please enter teh elements in Bag2: ");
		for (int i=0;i<n;i++)
		{
			bag2.add(input.nextInt());
		}
		
		System.out.println("Union");
		System.out.println();
		System.out.println("-----------");
		Bag<Integer> bag3=bag1.union(bag1, bag2);
		bag3.print();
		System.out.println("-----------");
		
		System.out.println("Intersection");
		System.out.println();
		System.out.println("-----------");
		Bag<Integer> bag4=bag1.intersection(bag1, bag2);
		bag4.print();
		System.out.println("-----------");
		
		System.out.println("Difference");
		System.out.println();
		System.out.println("-----------");
		Bag<Integer> bag5=bag1.difference(bag1, bag2);
		bag5.print();
		System.out.println("-----------");
	}
}
