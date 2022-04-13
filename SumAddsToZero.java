import java.util.Scanner;

class SumAddsToZero 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		int p;
		for(p=0; p<N; p++)
		{
			int num = sc.nextInt();
			arr[p] = num;
			System.out.println(arr[p]);
		} 

		for (p=0; p< N; p++)
		{
			for (int j=p+1; j< N; j++)
			{
				for ( int k=p+2; k< N; k++)
				{	
					if(arr[p] + arr[j] + arr[k] == 0 )
					{
						System.out.println("three integers whose addition is zero are  ");
						System.out.println(arr[p] +"  " + arr[j] +"  " +arr[k]);
					}
				}
			}
		}
	}
}
