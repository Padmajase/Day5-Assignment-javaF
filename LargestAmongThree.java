import java.util.Scanner;
class LargestAmongThree
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to find  ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3)
			System.out.println(num1 + "  is Largest among " + num1 +"  "+num2+"  " +num3);
		else if(num2 > num3)
			System.out.println(num2 + "  is Largest among " + num1+"  "+num2+"  " +num3);
		else
			System.out.println(num3 + "  is Largest among " + num1+"  "+num2 +"  "+num3);
	}
}