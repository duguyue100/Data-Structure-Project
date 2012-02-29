
public class TimeCard {
	private String workerID;
	private double payrate;
	private Time24 punchInTime, punchOutTime;
	
	public TimeCard(String id, double pr, int punchInHour, int punchInMinute)
	{
		workerID=id;
		payrate=pr;
		punchInTime.setTime(punchInHour, punchInMinute);
	}
	
	public String payWorker(int punchOutHour, int punchOutMinute)
	{
		punchOutTime.setTime(punchOutHour, punchOutMinute);
		Time24 result=punchOutTime.interval(punchInTime);
		return result.toString();
	}
}
