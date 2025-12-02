import java.util.Scanner;
public class SimpleInterest{
	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Input principal amount: ");
		double principal = input.nextDouble();
		System.out.println("Input rate: ");
		double rate = input.nextDouble();
		System.out.println("Input time (years): ");
		int time = input.nextInt();

		double simpleInterest = (principal * rate * time)/100;

		System.out.printf("The interest is $%.2f%n", simpleInterest);
}
}