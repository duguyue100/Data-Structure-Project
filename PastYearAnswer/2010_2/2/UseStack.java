
public class UseStack<T> {
	
	public ExtendedStack<Integer> decimalToBinary(int n)
	{
		ExtendedStack<Integer> stack=new ExtendedStack<Integer>();
		if (n>=0)
		{
			while (n!=0)
			{
				int s=n%2;
				n=n/2;
				stack.add(s);
			}
		}
		
		return stack;
	}
	
	public ExtendedStack<Integer> removeDuplication(ExtendedStack<Integer> stk)
	{
		ExtendedStack<Integer> stack=new ExtendedStack<Integer>();
		ExtendedStack<Integer> tmp=new ExtendedStack<Integer>();
		
		while (!stk.empty())
		{
			int t=stk.pop();
			if (tmp.search(t)<1) tmp.push(t); 
		}
		
		while (!tmp.empty())
			stack.push(tmp.pop());
		
		return stack;
	}
}
