public class Simple_Interest
{
	public static void main(String[] args)
	{
		double principal_amount,time,rate,SI;
		principal_amount=Double.parseDouble(args[0]);
		time=Double.parseDouble(args[1]);
		rate=Double.parseDouble(args[2]);
		SI=(principal_amount*time*rate)/100;	
		System.out.println("\nThe simple interest is "+SI);	
	}
}