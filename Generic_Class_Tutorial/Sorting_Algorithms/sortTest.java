// A simple implementation for sorting algorithms

// Author: Hu Yuhuang (duguyue100)
// E-mail: duguyue100@gmail.com

import java.util.*;

public class sortTest {
	public static void main(String[] args)
	{
		int[] a=new int[100];
		sort s=new sort();
		Scanner input=new Scanner(System.in);
		System.out.print("No. of elements: ");
		int n=input.nextInt();
		
		for (int i=1;i<=n;i++)
			a[i]=input.nextInt();
		
		System.out.println("-----Insertion Sort-----");
		s.insertion_sort(n, a);
		for (int i=1;i<=n;i++)
			System.out.println(a[i]);
		System.out.println("------------------------");
		
		for (int i=1;i<=n;i++)
			a[i]=input.nextInt();
		
		System.out.println("-----Merge Sort-----");
		s.merge_sort(a, 1, n);
		for (int i=1;i<=n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("--------------------");
		
		for (int i=1;i<=n;i++)
			a[i]=input.nextInt();
		
		System.out.println("-----Quick Sort-----");
		s.quick_sort(a, 1, n);
		for (int i=1;i<=n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("--------------------");
		
		for (int i=1;i<=n;i++)
			a[i]=input.nextInt();
		
		System.out.println("-----Bubble Sort-----");
		s.bubble_sort(a, n);
		for (int i=1;i<=n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("---------------------");
		
		for (int i=1;i<=n;i++)
			a[i]=input.nextInt();
		
		System.out.println("-----Heap Sort-----");
		s.heap_sort(a, n);
		for (int i=1;i<=n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("---------------------");
		
	}
}
