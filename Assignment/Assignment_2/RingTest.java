// Author: Hu Yuhuang (duguyue100)
// Metric No.: WEK110709
// E-mail: duguyue100@gmail.com

import java.util.*;
public class RingTest {
	public static void main(String[] args)
	{
		Ring ring=new Ring();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter  the total number of people in the circle: ");
		int N=input.nextInt();
		System.out.print("Enter the magic number for the diselection: ");
		int M=input.nextInt();
		
		for (int i=1;i<=N;i++)
		{
			ring.addE(convert(i));
		}
		
		System.out.print("The list in the initial round: ");
		ring.print();
		
		int i=1;
		while (ring.terminate()==false)
		{
			ring.eliminate(M);
			if (ring.terminate()==false)
			{
				System.out.print("The list after "+i+" round: ");
				ring.print();
			}	
			i++;
		}
		System.out.print("The remaining number is ");
		ring.print();
	}
	
	public static String convert(int n)
	{
		String result="";
		
		while (n!=0)
		{
			int m=n%26;
			n=(int)n/26;
			if (m==0) {m=26;n=n-1;}
			result=(char)(m+64)+result;
		}
		
		return result;
	}

}
