import java.util.Scanner;
import java.util.Random;

class FlipCoin
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Enter the number the coin to be flip that times  ");
		int num = sc.nextInt();
		int tailcount = 0;
		int headcount = 0;

		for(int i =0; i<num; i++)
		{
			int coin = rand.nextInt();
				
			if(coin < 1.5)
			{
				System.out.println("tail  ");
				tailcount++;
			}
			else
			{
				System.out.println("head  ");
				headcount++;
			}
		}
		
		System.out.println("headcount : "+headcount +" tailcount :  "+ tailcount);
		int p = (100 * headcount /  num) ;
		System.out.println("percentage of heads versus tail is " +p+"%");
	}
}