
public class PriceTest {
	public static void main(String[] args)
	{
		Price p[]=new Price[5];
		
		for (int i=0;i<p.length;i++)
			p[i]=new Price();
		
		p[0].setPrice(10.0);
		p[1].setPrice(10.9);
		p[2].setPrice(10.2);
		p[3].setPrice(10.2);
		p[4].setPrice(10.4);
		
		System.out.println(calculatePrice(p,0));
	}
	
	public static double calculatePrice(Price[] p, double rate)
	{
		double sum=0;
		for (int i=0;i<p.length;i++)
			sum+=p[i].getPrice(rate);
		
		int r=(int)Math.floor(sum);
		int s=(int)Math.round((sum-r)*100);
		int t=s%10;
		
		if (t==1 || t==2)
			s=(s/10)*10;
		else if (t==3 || t==4)
			s=(s/10)*10+5;
		else if (t==6 || t==7)
			s=(s/10)*10+5;
		else if (t==8 || t==9)
			s=(s/10+1)*10;
		
		sum=r+(double)s/100;
		
		return sum;
	}
}
