import java.util.Scanner;
import java.lang.Math;

class PowerOfTwo
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  ");
		int N = sc.nextInt();

		double twoPow = Math.pow(2,N);
		System.out.println("2^"+N+" = " +twoPow);

		int t = 1;
		int i = 1;

		System.out.println("two's table is");
		while(t < twoPow)
		{
			t = i * 2;
			System.out.println(t);
			i++;	
			
		}
				
	}
}