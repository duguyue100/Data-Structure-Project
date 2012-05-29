
public class Test {
	public static void main(String[] args)
	{
		int[] a={5,4,76,23,6254,6,23,45};
		
		exchangeSort(a);
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void exchangeSort(int[] arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
	}
}
