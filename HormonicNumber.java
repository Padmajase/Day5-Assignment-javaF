import java.util.Scanner;

class HormonicNumber {
	public static void main(String args [])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int N = s.nextInt();
		float hNum = 0;

		System.out.println(N+"th hormonic number is :");
		while(N > 0)
		{
			hNum = hNum + ( float )1/N;
			N--;
		}
		
		System.out.println(hNum);
	}
}