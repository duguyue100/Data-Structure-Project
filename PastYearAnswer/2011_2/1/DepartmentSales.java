
public class DepartmentSales {
	public String name;
	public double[] quarterlySales=new double[4];
	
	public DepartmentSales(String n)
	{
		name=n;
		for (int i=0;i<quarterlySales.length;i++)
			quarterlySales[i]=0;
	}
	
	public double get(int n)
	{
		if (n<1 || n>4)
			throw new IllegalArgumentException();
		else return quarterlySales[n-1];
	}
	
	public boolean set(int i,double n)
	{
		if (i>=1&&i<=4)
		{
			quarterlySales[i-1]=n;
			return true;
		}
		else return false;
	}
}
