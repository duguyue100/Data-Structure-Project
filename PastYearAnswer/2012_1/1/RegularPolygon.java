
public class RegularPolygon {
	private int n;
	private double s;
	private Point c;
	
	public RegularPolygon()
	{
		c=new Point(0,0);
	}
	
	public RegularPolygon(int n, int s, int x, int y)
	{
		if (n>=3) this.n=n;
		if (s>=1) this.s=s;
		c=new Point(0,0);
	}
	
	public double getPerimeter()
	{
		return n*s;
	}
	
	public double getArea()
	{
		return (n*s*s)/4*Math.tan(Math.PI/n);
	}
}
