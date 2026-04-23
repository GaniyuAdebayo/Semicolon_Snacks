import java.util.Scanner;

public class TwoPoints{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter x coordinate of point 1: ");
		int x1 = input.nextInt();

		System.out.println("Enter y coordinate of point 1: ");
		int y1 = input.nextInt();

		System.out.println("Enter x coordinate of point 2: ");
		int x2 = input.nextInt();

		System.out.println("Enter y coordinate of point 2: ");
		int y2 = input.nextInt();

		if (x1 == x2 && (y1 == 0 || y2 ==0))
			System.out.println("The points are perpendicular to x-axis");

		else if (y1 == y2 && (x1 == 0 || x2 == 0))
			System.out.println("The points are perpendicular to y-axis");

		else
			System.out.println("The points are not perpendicular to any axis");


	}
}