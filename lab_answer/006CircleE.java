
public class CircleE implements Comparable<CircleE>{
	private double radius;
	
	public CircleE()
	{
		
	}
	
	public double area()
	{
		return Math.PI*radius*radius; 
	}
	
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double r)
	{
		r=radius;
	}
	
	public boolean equals(Object item)
	{
		if (item.equals(this))
			return true;
		else return false;
	}

	public int compareTo(CircleE i)
	{
		if (i.radius==radius)
			return 0;
		else return 1;
	}
	
	
}
