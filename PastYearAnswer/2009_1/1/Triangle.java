
public class Triangle {
	private Point v1,v2,v3;
	private double e1,e2,e3;
	
	public Triangle(Point a, Point b, Point c)
	{
		if (isColinear(a,b,c)==true)
			throw new IllegalArgumentException();
		else
		{
			v1=a;
			v2=b;
			v3=c;
			
			e1=distance(v1,v2);
			e2=distance(v2,v3);
			e3=distance(v3,v1);
		}
	}
	
	private double curve(Point p1,Point p2)
	{
		return (p2.gety()-p1.gety())/(p2.getx()-p1.getx());
	}
	
	private boolean isColinear(Point a, Point b, Point c)
	{
		if (curve(a,b)==curve(b,c))
			return true;
		else return false;
	}
	
	private double distance(Point p1,Point p2)
	{
		return Math.sqrt((p1.getx()-p2.getx())*(p1.getx()-p2.getx())+(p1.gety()-p2.gety())*(p1.gety()-p2.gety()));
	}
	
	
}
