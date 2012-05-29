
public class Price {
	private int ringgit;
	private int sen;
	
	public Price()
	{
		ringgit=0;
		sen=0;
	}
	
	public void setPrice(double price)
	{
		if (price>=0)
		{
			ringgit=(int)Math.floor(price);
			sen=(int)Math.round((price-ringgit)*100);
		}
	}
	
	public double getPrice(double rate)
	{
		double price=ringgit+((double)sen/100);
		if (rate>=0 && rate<=100)
		{
			price=price*(1-rate/100);
		}
		
		return price;
	}
}
