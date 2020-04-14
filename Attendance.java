public class Attendance
{
	public static void main(String args[])
	{
		int gen,over;
		gen=Integer.parseInt(args[0]);
		over=Integer.parseInt(args[1]);
		if(gen==1)	//0-Absent	1-Present
		{
			if(over==1)
			{
				System.out.println("The total salary is 1500");
			}
			else
			{
				System.out.println("The total salary is 1000");
			}
		}
		else
		{
			System.out.println("The total salary is 0");
		}
	}
}