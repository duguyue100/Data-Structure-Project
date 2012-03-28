import java.util.*;
public class Member<T> {
	public T id;
	
	public Member(T v1)
	{
		id=v1;
	}
	
	public T getId()
	{
		return id;
	}
	
	public void setId(T v1)
	{
		id=v1;
	}
	
	public String toString()
	{
		return id.toString();
	}
}
