import java.util.*;
public class CalculatorUtility {
	
	public String ConvertInfix_Prefix (String infix)
	{
		String output="";
		Stack<Character> a=new Stack<Character>();
		Stack<Character> b=new Stack<Character>();
		a.push('#');
		
		for (int i=infix.length()-1;i>=0;i--)
		{
			char ch=infix.charAt(i);
			
			if (ch>='0'&&ch<='9')
				b.push(ch);
			else if (ch==')')
				a.push(ch);
			else if (ch=='(')
			{
				while (a.peek()!=')')
					b.push(a.pop());
				a.pop();
			}
			else if (ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^')
			{
				char t=a.peek();
				if (rank(ch)==rank(t)&&ch=='^')
					b.push(ch);
				else if (rank(ch)>=rank(t))
					a.push(ch);
				else {
					while (rank(ch)<rank(a.peek()))
					{
						b.push(a.pop());
					}
					a.push(ch);
				}
			}
		}
		
		while (a.peek()!='#')
			b.push(a.pop());
		
		while (!b.isEmpty())
			output=output+b.pop();
		
		return output;
	}
	
	public String ConvertInfix_Postfix(String infix)
	{
		String output="";
		Stack<Character> a=new Stack<Character>();
		Stack<Character> b=new Stack<Character>();
		a.push('#');
		
		for (int i=0;i<infix.length();i++)
		{
			char ch=infix.charAt(i);
			
			if (ch>='0'&&ch<='9')
				b.push(ch);
			else if (ch=='(')
				a.push(ch);
			else if (ch==')')
			{
				while (a.peek()!=')')
					b.push(a.pop());
				a.pop();
			}
			else if (ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^')
			{
				char t=a.peek();
				if ((rank(t)==rank(ch))&&ch=='^')
					a.push(ch);
				else if (rank(t)<rank(ch))
					a.push(ch);
				else{
					while (rank(ch)<=rank(a.peek()))
					{
						b.push(a.pop());
					}
					a.push(ch);
				}
			}
		}
		
		while (a.peek()!='#')
			b.push(a.pop());
		
		while (!b.isEmpty())
			output=b.pop()+output;
		
		return output;
	}
	
	public int rank(char ch)
	{
		if (ch=='^')
			return 3;
		if (ch=='*'||ch=='/')
			return 2;
		if (ch=='+'||ch=='-')
			return 1;
		return 0;
	}
	
	public double EvaluatePrefix_Expression(String prefix)
	{
		Stack<Double> a=new Stack<Double>();
		double x,y;
		
		for (int i=prefix.length()-1;i>=0;i--)
		{
			char ch=prefix.charAt(i);
			if (ch>='0'&&ch<='9')
				a.push((double)(ch-'0'));
			else if (ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^')
			{
				switch(ch)
				{
				case '+':
				{
					x=a.pop();
					y=a.pop();
					a.push(x+y);
					break;
				}
				case '-':
				{
					x=a.pop();
					y=a.pop();
					a.push(x-y);
					break;
				}
				case '*':
				{
					x=a.pop();
					y=a.pop();
					a.push(x*y);
					break;
				}
				case '/':
				{
					x=a.pop();
					y=a.pop();
					a.push(x/y);
					break;
				}
				case '^':
				{
					x=a.pop();
					y=a.pop();
					double t=1;
					for (double j=1;j<=y;j++) t=t*x;
					a.push(t);
					break;
				}
				}
			}
		}
		
		return a.peek();
	}
	
	public double EvaluatePostfix_Expression(String postfix)
	{
		Stack<Double> a=new Stack<Double>();
		double x,y;
		for (int i=0;i<postfix.length();i++)
		{
			char ch=postfix.charAt(i);
			if (ch>='0'&&ch<='9')
				a.push((double)(ch-'0'));
			else if (ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^')
			{
				switch(ch)
				{
				case '+':
				{
					y=a.pop();
					x=a.pop();
					a.push(x+y);
					break;
				}
				case '-':
				{
					y=a.pop();
					x=a.pop();
					a.push(x-y);
					break;
				}
				case '*':
				{
					y=a.pop();
					x=a.pop();
					a.push(x*y);
					break;
				}
				case '/':
				{
					y=a.pop();
					x=a.pop();
					a.push(x/y);
					break;
				}
				case '^':
				{
					y=a.pop();
					x=a.pop();
					double t=1;
					for (double j=1;j<=y;j++) t=t*x;
					a.push(t);
					break;
				}
				}
			}
		}
		
		return a.peek();
	}
}