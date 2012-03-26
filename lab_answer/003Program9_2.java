import java.util.Scanner;

import ds.util.ArrayList;

public class Program9_2 {
	public static void main(String[] args)
	{
		ArrayList<String> Sam=new ArrayList<String>();
		Scanner input=new Scanner(System.in);
		
		String in=input.nextLine();
		int length1=-1;
		int length2=1000000;
		
		while (!in.equalsIgnoreCase("ko"))
		{
			Sam.add(in);
			if (in.length()>length1)
			{
				length1=in.length();
			}
			if (in.length()<length2)
			{
				length2=in.length();
			}
			in=input.nextLine();
		}
		
		System.out.println("Longest String");
		System.out.println("--------------");
		for (int i=0;i<Sam.size();i++)
		{
			if (Sam.get(i).length()==length1)
				System.out.println(Sam.get(i));
		}
		System.out.println("--------------");
		
		System.out.println();
		System.out.println("Shortest String");
		System.out.println("---------------");
		for (int i=0;i<Sam.size();i++)
		{
			if (Sam.get(i).length()==length2)
			{
				System.out.println(Sam.get(i));
			}
		}
		System.out.println("---------------");
		
	}
}

