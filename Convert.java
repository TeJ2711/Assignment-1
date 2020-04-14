public class Convert
{
	public static void main(String args[])
	{
		String y;
		y=args[0];
		int choice;
		choice=Integer.parseInt(args[1]);
		if(choice==0)		//0-Lowercase	1-Uppercase
		{
			System.out.println(y.toLowerCase());
		}
		else if(choice==1)
		{
			System.out.println(y.toUpperCase());
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
}