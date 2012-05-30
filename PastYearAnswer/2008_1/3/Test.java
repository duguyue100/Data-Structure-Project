
public class Test<T> {
	public T[] a;
	public static void main(String[] args)
	{
		Test<Integer> test = new Test<Integer>();
		test.a=new Integer[18];
		for (int i=0;i<test.a.length;i++)
		{
			test.a[i]=i;
		}
		
		test.a[3]=2;
		
		System.out.println(seqSearch(test.a,0,17,6));
		System.out.println(isUnique(test.a,3));
	}
	
	public static <T extends Comparable<? super T>> int seqSearch(T[] arr, int first, int last, T target)
	{
		if (arr[first].compareTo(target)==0)
		{
			return first;
		}
		else if (first==last)
		{
			return -1;
		}
		else return seqSearch(arr,first+1,last,target);
	}
	
	public static <T extends Comparable<? super T>> boolean isUnique(T[] arr, T target)
	{
		if (seqSearch(arr,0,arr.length-1,target)==-1)
		{
			return false;
		}
		else
		{
			int n=seqSearch(arr,seqSearch(arr,0,arr.length-1,target)+1,arr.length-1,target);
			if (n!=-1)
				return false;
			else return true;
		}
	}
}
