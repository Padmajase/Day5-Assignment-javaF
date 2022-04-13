import java.util.Scanner;
import java.lang.Math;

class WindChill 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Farenheit ");
		float t = sc.nextFloat();
		System.out.println("Enter the wind speed in miles per hour ");
		float v = sc.nextFloat();	

		if(t > 35 && t < 50  &&  3 <= v && v <= 120)
		{
			double w = 35.74 + (0.6215 * t ) + ((0.4275 * t) - 35.75) * (Math.pow(v,0.16));
			System.out.println("The wind chill = " +w);
		}
		else
		{
			System.out.println("values are not in range");

		}
	}
}
