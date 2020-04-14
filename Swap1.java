public class Swap1
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("\nBefore Swapping:");
		System.out.println("\na= "+a);
		System.out.println("\nb= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\nBefore Swapping:");
		System.out.println("\na= "+a);
		System.out.println("\nb= "+b);
	}
}