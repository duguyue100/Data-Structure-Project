
public class Cube extends Square implements Volume{
	
	public Cube()
	{
		super();
	}
	
	public Cube(double e)
	{
		this.edge=e;
	}
	
	public double volume()
	{
		return this.edge*this.edge*this.edge;
	}
	
}
