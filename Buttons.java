import java.util.Scanner;
public class Buttons
{
	public static void main(String[] args)
	{
		Scanner z=new Scanner(System.in);
		long n=z.nextLong();
		System.out.println(n+n*(n*(n+1))/2-(n*(n+1)*(2*n+1))/6);
		z.close();
	}
}