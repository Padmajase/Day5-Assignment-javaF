// operator program 3. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
// Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula 
// delta = b*b - 4*a*c
// Root 1 of x = (-b + sqrt(delta))/(2*a)
// Root 2 of x = (-b - sqrt(delta))/(2*a)
// Take a, b, and c as input values to find the roots of x.

import java.lang.Math;
import java.util.Scanner;
class Quadratic {
	public static void main(String args[]) {

		System.out.println("Enter value of a b c");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int delta = (b*b - 4*a*c);

		double root1 = (-b + (Math.pow(delta,1/2))) / (2*a);
		double root2 = (-b - (Math.pow(delta,1/2))) / (2*a);

		System.out.println("one Root of equation is " +root1);
		System.out.println("second Root of equation is " +root2);
	}
}