
public class AnnualSales {
	public DepartmentSales[] department=new DepartmentSales[4];
	
	public void set(int n, DepartmentSales ds)
	{
		if (n>4 || n<1)
		{
			throw new IllegalArgumentException();
		}
		else department[n-1]=ds;
	}
	
	public double salesForQuater(int n)
	{
		double sum=0.0;
		if (n<=4&&n>=1)
		{
			for (int i=0;i<department.length;i++)
				sum+=department[i].quarterlySales[n-1];
		}
		else throw new IllegalArgumentException();
		
		return sum;
	}
	
	public String companyGrowthPercentage(int n)
	{
		double sum1=0.0;
		double sum2=0.0;
		double growth=0.0;
		if (n>=2&&n<=4)
		{
			
			for (int i=0;i<department.length;i++)
			{
				sum1+=department[i].quarterlySales[n-1];
				sum2+=department[i].quarterlySales[n-2];
			}
			
			growth=sum1-sum2;
		}
		
		return Double.toString((growth/sum2)*100)+"%";
				
	}
}
