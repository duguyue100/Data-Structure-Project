import ds.util.Bag;
import java.util.*;

public class Program8_1 {
	public static void main(String[] args)
	{
		Scanner keyIn = new Scanner(System.in); 

		Bag<Integer> bagA, bagB;
		
		Integer ch;
		
		boolean foundDuplicate;
		
		System.out.println("Enter five numbers for bagA: ");

		bagA = new Bag<Integer>(5);
		bagB = new Bag<Integer>(10);

		for (int i = 0; i < 5; i++)
			bagA.add(keyIn.nextInt());
		
		System.out.println();
		System.out.println("-----------");
		System.out.println("-----------");
		System.out.println();
		System.out.println("Enter five numbers for bagB: ");
		
		for (int i=0;i<5;i++)
			bagB.add(keyIn.nextInt());
		
		
		while (!bagA.isEmpty())
		{
			// remove a random character from bagA and add to bagB
			ch = bagA.grab();
			bagB.add(ch);

			// remove all occurrence of target = chObj from bagA
			do
				foundDuplicate = bagA.remove(ch);
			while (foundDuplicate);
		}
		
		Object[] objArr = bagB.toArray();
		Arrays.sort(objArr);
		System.out.println("Sorted letters: " +
		                   Arrays.toString(objArr));
		
		
	}
}