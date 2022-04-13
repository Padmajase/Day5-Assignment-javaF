import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		System.out.println("Enter Year");
		Scanner scan=new Scanner(System.in);
		long y=scan.nextLong();
		if( y >= 1582)
		{
			if( y%4 ==0 && y%400 == 0)
			{
				System.out.println(y+" is the leap Year");
			}
			else
			{
				System.out.println(y+" is not the leap Year");
			}	
		}
		else
		{
			System.out.println("invalid year entered");
		}
		
	}

}