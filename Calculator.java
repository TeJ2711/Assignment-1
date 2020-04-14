public class Calculator
{
	public static void main(String[] args)
	{
		double a,b,c;
		int choice;
		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);
		//1.Addition	2.Subtraction	3.Multiplication	4.Division
		//Enter your choice;
		choice=Integer.parseInt(args[2]);
		switch(choice)
		{
			case 1:
				c=a+b;
				System.out.println("\nSum is "+c);
				break;
			case 2:
				c=a-b;
				System.out.println("\nDifference is "+c);
				break;			
			case 3:
				c=a*b;
				System.out.println("\nProduct is "+c);
				break;			
			case 4:
				c=a/b;
				System.out.println("\nQuotient is "+c);
				break;
			default:
				System.out.println("\nInvalid Choice");			
		}
	}
}