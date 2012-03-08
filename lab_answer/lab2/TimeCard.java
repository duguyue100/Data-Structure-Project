
public class TimeCard {
	private String workerID;
	private double payrate;
	private Time24 punchInTime=new Time24(), punchOutTime=new Time24();
	
	public TimeCard(String id, double pr, int punchInHour, int punchInMinute)
	{
		workerID=id;
		payrate=pr;
		punchInTime.setTime(punchInHour, punchInMinute);
	}
	
	public String printID()
	{
		return workerID;
	}
	
	public String printInTime()
	{
		return punchInTime.toString();
	}
	
	public String printOutTime()
	{
		return punchOutTime.toString();
	}
	
	public String payWorker(int punchOutHour, int punchOutMinute)
	{
		punchOutTime.setTime(punchOutHour, punchOutMinute);
		Time24 result=punchInTime.interval(punchOutTime);
		return result.toString();
	}
}
