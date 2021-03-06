import java.util.*;
public class SimpleCalculator {
	public static void main(String[] args)
	{
		Scanner inputYN=new Scanner(System.in);
		Scanner inputContinue=new Scanner(System.in);
		CalculatorUtility cal=new CalculatorUtility();
		
		System.out.println("Welcome to Prefix, Infix & Postfix System:");
		System.out.println("Please select the menu:");
		System.out.println();
		System.out.println("1: Input the infix, convert to prefix and evaluate");
		System.out.println("2: Input the infix, convert to postfix and evaluate");
		System.out.println();
		System.out.println();
		System.out.println();
		
		do
		{
			System.out.print("Enter your preference: ");
			Scanner inputN=new Scanner(System.in);
			String choice=inputN.nextLine();
			Scanner inputS=new Scanner(System.in);
			
			if (choice.equals("1"))
			{
				System.out.print("Please Enter your Infix notation: ");
				String infix=inputS.nextLine();
				String preFix=cal.ConvertInfix_Prefix(infix);
				System.out.println("YOUR Prefix is: ");
				System.out.println(preFix);
				System.out.println("Do you want to evaluate it (Y/N)?");
				if (inputYN.nextLine().equalsIgnoreCase("Y"))
				{
					System.out.println(cal.EvaluatePrefix_Expression(preFix));
				}
				
			}
			else if (choice.equals("2"))
			{
				System.out.print("Please Enter your Infix notation: ");
				String infix=inputS.nextLine();
				String postFix=cal.ConvertInfix_Postfix(infix);
				System.out.println("YOUR Postfix is: ");
				System.out.println(postFix);
				System.out.println("Do you want to evaluate it (Y/N)?");
				if (inputYN.nextLine().equalsIgnoreCase("Y"))
				{
					System.out.println(cal.EvaluatePostfix_Expression(postFix));
				}
			}
			else System.out.println("You enter a invalid choice.");
			
			System.out.println("Do you want to continue (Y/N):");
			
		}while (inputContinue.nextLine().equalsIgnoreCase("Y"));
		
		System.out.println("The End.");
	}
}
