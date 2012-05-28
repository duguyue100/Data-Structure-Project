
public class departmentTest {
	public static void main(String[] args)
	{
		DepartmentSales a = new DepartmentSales("sale");
		DepartmentSales a1 = new DepartmentSales("sale");
		DepartmentSales a2 = new DepartmentSales("sale");
		DepartmentSales a3 = new DepartmentSales("sale");
		
		
		a.set(1, 1);
		a.set(2, 2);
		a.set(3, 3);
		a.set(4, 4);
		
		for (int i=1;i<=a.quarterlySales.length;i++)
		{
			System.out.println(a.get(i));
		}
		
		a1=a;a2=a;a3=a;
		
		AnnualSales company=new AnnualSales();
		
		company.set(1, a);
		company.set(2, a1);
		company.set(3, a2);
		company.set(4, a3);
		
		System.out.println(company.salesForQuater(2));
		System.out.println(company.companyGrowthPercentage(4));
	}
}
