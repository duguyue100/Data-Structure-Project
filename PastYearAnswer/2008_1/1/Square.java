
public class Square implements Measurment{
	protected double edge;
	
	public Square()
	{
		edge=0;
	}
	
	public Square(double e)
	{
		edge=e;
	}
	
	public void setEdege(double e)
	{
		edge=e;
	}
	
	public String toString()
	{
		return "Square with edge "+edge;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return edge*edge;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return edge*4;
	}
}
