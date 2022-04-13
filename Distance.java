import java.util.Scanner;
import java.lang.Math;

class Distance {
	public static void main(String args[]) {
	
		int x = Integer.parseInt(args[0]);
		int y  = Integer.parseInt(args[1]);

		double distance = Math.pow((x*x + y*y) , 0.5); 
		System.out.println("Euclidian distance is " + distance);
	}
}