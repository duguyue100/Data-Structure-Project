
public class Test {
	public static void main(String[] args)
	{
		int a[]=new int[3];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		System.out.println(isMember(a,3));
	}
	
	public static boolean isMember(int a[], int value)
	{
		if (recursiveSearch(a,value,a.length-1)==-1)
			return false;
		else return true;
	}
	
	public static int recursiveSearch(int a[],int value, int index)
	{
		if (a[index]==value)
			return index;
		else if (index==0)
			return -1;
		else
			return recursiveSearch(a,value,index-1);
	}
}
