import java.util.Scanner;
public class Vowel1
{
	
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		char y=obj.next().charAt(0);
		if(y=='a'||y=='A'||y=='e'||y=='E'||y=='i'||y=='I'||y=='o'||y=='O'||y=='u'||y=='U')
		{
			System.out.println(y+" is vowel");
		}
		else
		{
			System.out.println(y+" is consonant");
		}

	}
}