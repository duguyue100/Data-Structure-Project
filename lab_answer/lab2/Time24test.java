
public class Time24test {
	public static void main(String[] args)
	{
		Time24 time=new Time24(10,500);
		Time24 t=new Time24();
		double payrate=15.00;
		
		TimeCard worker=new TimeCard("555-83-2345",payrate,8,30);
		String punchOut=worker.payWorker(16, 30);
		
		System.out.println("Worker: "+worker.printID());
		System.out.println("Start Time: "+ worker.printInTime() + " End Time: "+worker.printOutTime());
		System.out.println("Total Time: "+ punchOut);
		System.out.println("At $"+payrate+ " per hour, pay is $"+Double.parseDouble(punchOut)*payrate);
		
		
	}
}
