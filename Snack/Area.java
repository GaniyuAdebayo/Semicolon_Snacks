import java.util.Scanner;

public class Area{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);
		
		System.out.println("Input length of rectangle: ");
		double length = input.nextDouble();

		System.out.println("Input width of rectangle: ");
		double width = input.nextDouble();

		double area = length * width;

		System.out.printf("The area of the rectangle of length %.2f and width %.2f is %.2f%n%n", length, width, area);

}


}