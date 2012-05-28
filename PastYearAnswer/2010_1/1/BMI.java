
public class BMI {
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public BMI(String name, int age, double weight, double height)
	{
		this.name=name;
		if (age<20)
			throw new IllegalArgumentException();
		else this.age=age;
		this.weight=weight;
		this.height=height;
	}
	
	public double getBMI()
	{
		return this.weight/(this.height*this.height);
	}
	
	public String getStatus()
	{
		double status=getBMI();
		
		if (status<16.5)
			return "Severely underweight";
		else if (status>=16.5 && status<18.5)
			return "Underweight";
		else if (status>=18.5 && status<25)
			return "Normal";
		else if (status>=25 && status<=30)
			return "Overweight";
		else
			return "Obese";
	}
}
