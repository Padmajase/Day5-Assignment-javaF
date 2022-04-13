import java.util.Scanner;
class ComputeQuoteintRemainder
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to find  ");
		int num = sc.nextInt();
		
		int q = num/10*10;
		int r = num%10;
		
		System.out.println("quotient = " +q);
		
		System.out.println("remainder = " +r);
		
	}
}