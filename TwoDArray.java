import java.util.*;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

class TwoDArray 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int M = sc.nextInt();
		System.out.println("Enter the number of columns ");
		int N = sc.nextInt();
		int num;

		int arr[][] = new int[M][N];
		int p;
		int q;
		try{	
		File file = new File("C:/Users/Admin/Desktop/bg/notes.txt");
		
		for(p=0; p < M; p++)
		{
			for(q=0;  q < N; q++)
			{
				System.out.println("Enter the item in array ");
				arr[p][q] = sc.nextInt();
				//System.out.print(arr[p][q]);
				PrintWriter out = new PrintWriter(file);
				out.println(arr[p][q]);
				out.close();
			}
		} 
		} catch (IOException e);
	}
}
