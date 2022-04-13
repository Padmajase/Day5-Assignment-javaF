import java.util.Scanner;
class SwapTwoNumbers
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number 1 ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the number 2 ");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swapping number1 = " +num1 +  "  ,  number2 =  "   +num2);
		int tempNum = 0;
		tempNum = num1;
		num1 = num2;
		num2 = tempNum;
		System.out.println("After Swapping number1 = " +num1 +  "  ,   number2 =  "   +num2);
	}
}