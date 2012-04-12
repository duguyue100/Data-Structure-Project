// Author: Hu Yuhuang.
// E-mail: duguyue100@gmail.com
import ds.util.LinkedList;
import java.util.*;
public class Program10_3 {
	public static void main(String[] args)
	{
		String str;
		LinkedList<Character> charList=new LinkedList<Character>();
		
		Scanner keyIn=new Scanner(System.in);
		int i;
		char ch;
		
		System.out.print("Enter the string:");
		str=keyIn.nextLine();
		
		for (i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if (Character.isLetter(ch))
				charList.addLast(Character.toLowerCase(ch));
		}
		
		if (isPalindrome(charList))
			System.out.println("'"+str+"' is a palindrome");
		else
			System.out.println("'"+str+"' is not a palindrome");
		
		// integer list.
		LinkedList<Integer> intList=new LinkedList<Integer>();
		System.out.println("Enter Integers:");
		Scanner input=new Scanner(System.in);
		for (i=1;i<=3;i++)
		{
			intList.addLast(input.nextInt());
		}
		
		if (isPalindrome(intList))
			System.out.println("'"+intList.toString()+"' is a palindrome");
		else
			System.out.println("'"+intList.toString()+"' is not a palindrome");
		
	}
	
	public static Boolean isPalindrome(LinkedList<?> aList)
	{
		while (aList.size() > 1)
		{
			if (aList.getFirst().equals(aList.getLast())== false)
				return false;

			aList.removeFirst();
			aList.removeLast();
		}
		return true;
	}


}
