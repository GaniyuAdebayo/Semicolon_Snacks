

import java.util.Scanner;

public class TriangleArea{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter height: ");
		double height = input.nextDouble();

		System.out.println("Enter base length: ");
		double base = input.nextDouble();

		double area = 0.5 * base * height;

		System.out.printf("The area of the triangle is %.2f%n", area);
}
}