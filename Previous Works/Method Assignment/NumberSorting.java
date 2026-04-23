import java.util.Scanner;
public class NumberSorting{
	public static void main (String [] args){

		double[] number = new double[3];
		Scanner input = new Scanner (System.in);
		for (int counter = 0; counter <= 2; counter++){
			
			System.out.println("Enter number: ");			
			number[counter] = input.nextDouble();
		}
		displaySortedNumbers(number[0], number[1], number[2]);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3){

		double largest = num1;

		if (num2 > largest)
			largest = num2;
		if (num3 > largest)
			largest = num3;

		double smallest = num1;
		
		if (num2 < smallest)
			smallest = num2;
		if (num3 < smallest)
			smallest = num3;

		System.out.printf("%.2f, %.2f, %.2f%n", largest, (num1 + num2 + num3 - largest - smallest), smallest);

	}
}