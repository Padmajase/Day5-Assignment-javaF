import java.util.Scanner;

class FactorsOfNumber {
	public static void main(String args [])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int N = s.nextInt();
		float hNum = 0;

		for(int i =2; i<= N/2 ; i++)
		{
			if( N % i == 0)
			{
					if(i==2 || i % 2 != 0)
					System.out.println("prime factors are :");
					System.out.println(i);
			}
		}
		
	}
}