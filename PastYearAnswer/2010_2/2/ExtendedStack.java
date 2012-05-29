import java.util.*;
public class ExtendedStack<T> extends Stack<T> {
	//Stack<T> stack=new Stack<T>();
	public String toString()
	{
		String out="";
		for (int i=this.toArray().length-1;i>=0;i--)
		{
			out+=this.toArray()[i].toString()+" ";
		}
		
		return out;
	}
}
