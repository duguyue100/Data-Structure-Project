import java.text.DecimalFormat;
import java.util.Scanner;


public class Time24 {
	private int hour;
	private int minute;
	
	
	private void normalizeTime()
	{
		int extraHours=minute/60;
		
		minute%=60;
		hour=(hour+extraHours%24);
	}
	
	public Time24()
	{
		hour=0;
		minute=0;
	}
	
	public Time24(int h, int m)
	{
		hour=h;
		minute=m;
		normalizeTime();
	}
	
	public void addTime(int m)
	{
		if (m<0)
		{
			throw new IllegalArgumentException("Time24.setTime: "+ "argument must be a positive integer");
		}
		
		minute+=m;
		normalizeTime();
	}
	
	public Time24 interval(Time24 t)
	{
		int currTime=hour*60+minute;
		int tTime=t.hour*60+t.minute;
		
		if (tTime<currTime)
			tTime+=24*60;
		
		return new Time24(0,tTime-currTime);
	}
	
	public int getHour()
	{
		Scanner input=new Scanner(System.in);
		return input.nextInt();
	}
	
	public int getMinute()
	{
		Scanner input=new Scanner(System.in);
		return input.nextInt();
	}
	
	public void setTime(int h, int m)
	{
		if (h<0||m<0)
		{
			throw new IllegalArgumentException("Time24.setTime: "+"parameters must be positive integers");
		}
		
		this.hour=h;
		this.minute=m;
		
		normalizeTime();
	}
	
	public String toString()
	{
		DecimalFormat fmt=new DecimalFormat("00");
		return new String(hour+"."+fmt.format(minute));
	}
	
	public static Time24 praseTime(String s)
	{
		String hours="";
		String minutes="";
		
		int k=0;
		while (s.charAt(k)!=':')
		{
			hours=hours+s.charAt(k);
			k++;
		}
		k++;
		while (k<s.length())
		{
			minutes=minutes+s.charAt(k);
			k++;
		}
		
		return new Time24(Integer.parseInt(hours),Integer.parseInt(minutes));
	}
}
