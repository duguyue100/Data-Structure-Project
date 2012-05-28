
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
		
		System.out.println(binarySearch(test.a,0,17,6));
	}
	
	public static <T extends Comparable<? super T>> int binarySearch(T[] arr, int first, int last, T target)
	{
		if (arr[(first+last)/2].compareTo(target)==0)
		{
			return (first+last)/2;
		}
		else if (arr[(first+last)/2].compareTo(target)<0 && (first+last)/2!=arr.length-1)
		{	
			return binarySearch(arr, ((first+last)/2)+1, last,target);
		}
		else if (arr[(first+last)/2].compareTo(target)>0 && (first+last)/2!=0)
		{
			return binarySearch(arr, first, (first+last)/2,target);
		}
		else return -1;
	}
}
