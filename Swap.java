public class Swap
{
	public static void main(String args[])
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("\nBefore Swapping:");
		System.out.println("\na= "+a);
		System.out.println("\nb= "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("\nBefore Swapping:");
		System.out.println("\na= "+a);
		System.out.println("\nb= "+b);
	}
}