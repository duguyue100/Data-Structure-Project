// Here, I list 5 sorting algorithms.
// 1. Insertion Sort (Introduction sorting algorithm)
// 2. Merge Sort (A classic recursive example)
// 3. Quick Sort (My favorite sorting algorithm)
// 4. Bubble Sort (Almost easiest sorting algorithm)
// 5. Heap Sort (A important data structure)

// Just for record, I use integer array to show the examples,
// you can also expand it into "Objects", and compare them.
// However, if you write program like that way, you need to determine
// the definition of ">" and "<".

// And these five algorithms can be classified as "Sorting Algorithms based
// Comparison".

// It's hard to expand them and explain them in detail here.
// I suggest you to read "Introduction to Algorithms (Third Edition)"

// Programming for fun!

// Author: Hu Yuhuang (duguyue100)
// E-mail: duguyue100@gmail.com

import java.util.*;

public class sort {
	
	// insertion_sort.
	public void insertion_sort(int length, int[] a)
	{
		int key=0,i=0;
		for (int j=2;j<=length;j++)
		{
			key=a[j];
			i=j-1;
			while ((i>0)&&(a[i]>key))
			{
				a[i+1]=a[i];
				i--;
			}
			a[i+1]=key;
		}
	}
	
	
	// merge_sort.
	public void merge(int[] a, int p, int q, int r)
	{
		int n1=q-p+1;
		int n2=r-q;
		int i=0,j=0;
		int[] L=new int[100],R=new int[100];
		
		for (i=1;i<=n1;i++)
			L[i]=a[p+i-1];
		
		for (j=1;j<=n2;j++)
			R[j]=a[q+j];
		
		L[n1+1]=99999999;
		R[n2+1]=99999999;
		
		i=1;
		j=1;
		
		for (int k=p;k<=r;k++)
		{
			if (L[i]<=R[j])
			{
				a[k]=L[i];
				i++;
			}
			else
			{
				a[k]=R[j];
				j++;
			}
		}
	
	}
	
	public void merge_sort(int[] a, int p, int r)
	{
		if (p<r)
		{
			int q=(p+r)/2;
			merge_sort(a,p,q);
			merge_sort(a,q+1,r);
			merge(a,p,q,r);
		}
	}
	
	//quick_sort.
	public void quick_sort(int[] a, int l, int r)
	{
		int i=0,j=0,x=0,y=0;
		
		i=l;
		j=r;
		x=a[(l+r)/2];
		do
		{
			while (a[i]<x) i++;
			while (x<a[j]) j--;
			
			if (i<=j)
			{
				y=a[i];
				a[i]=a[j];
				a[j]=y;
				i++;
				j--;
			}
		}while(i<=j);
		
		if (i<r) quick_sort(a,i,r);
		if (l<j) quick_sort(a,l,j);
	}
	
	// bubble_sort.
	public void bubble_sort(int[] a, int length)
	{
		for (int i=1;i<=length-1;i++)
		{
			for (int j=length;j>=i+1;j--)
			{
				if (a[j-1]>a[j])
				{
					int t=a[j-1];
					a[j-1]=a[j];
					a[j]=t;
				}
			}
		}
	}
	
	//heap_sort
	public int left(int i)
	{
		return 2*i;
	}
	
	public int right(int i)
	{
		return 2*i+1;
	}
	
	public int parent(int i)
	{
		return i/2;
	}
	
	public void max_heapify(int[] a, int i, int size)
	{
		int l=left(i);
		int r=right(i);
		int largest;
		
		if (l<=size && a[l]>a[i])
			largest=l;
		else largest=i;
		
		if (r<=size && a[r]>a[largest])
			largest=r;
		
		if (largest!=i)
		{
			int t=a[i];
			a[i]=a[largest];
			a[largest]=i;
			max_heapify(a,largest,size);
		}
	}
	
	public void build_max_heap(int a[], int size)
	{
		int length=size;
		for (int i=length/2;i>=1;i--)
			max_heapify(a,i,length);
	}
	
	public void heap_sort(int a[], int size)
	{
		int length=size;
		build_max_heap(a,size);
		
		for (int i=size;i>=2;i--)
		{
			int t=a[1];
			a[1]=a[i];
			a[i]=t;
			length--;
			max_heapify(a,1,length);
		}
	}
}
